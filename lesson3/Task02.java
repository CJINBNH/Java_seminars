package lesson3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.HashSet;
import javax.sound.sampled.SourceDataLine;

// Заполнить список названиями планет Солнечной системы в произвольном порядке
//с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

public class Task02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Земля");
        list.add("Марс");
        list.add("Меркурий");
        list.add("Нептун");
        list.add("Венера");
        list.add("Земля");
        list.add("Марс");
        list.add("Юпитер");
        list.add("Нептун");
        list.add("Сатурн");
        list.add("Земля");
        list.add("Уран");
        list.add("Нептун");
        list.add("Земля");
        list.add("Плутон");
        list.add("Марс");

        list.sort( new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        });

        int count = 1;

        for (int i = 0; i < list.size() - 1; i++){
            String str = list.get(i);
            if (list.get(i).equals(list.get(i + 1))){
                count++;
            }
            else{
                System.out.println(str + " " + count);
                count = 1;
            }
        }
        System.out.println(list.get(list.size() - 1) + " " + count);

//Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

        Set<String> set = new HashSet<>(list);
        System.out.print(set);

        // for (int i = 0; i < list.size(); i++){
        //     if (list.get(i).equals(list.get(i - 1))){
        //         list.remove(i);
        //         i--;
        //     }
        // }
        // System.out.println(list);
    }
}