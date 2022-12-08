// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        IntegerComparator ic = new IntegerComparator();
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(101) - 50;
            System.out.println(num);
            list.add(num);
        }
        list.sort(ic);
        System.out.println(list);
    }
}
