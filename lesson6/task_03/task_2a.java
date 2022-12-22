import java.time.LocalDate;
import java.time.Month;

public class task_2a {
    public static void main (String[] args) {
        Cat cat1 = new Cat("Барсик", "Иванов", LocalDate.of(2017, Month.MARCH, 29), "сфинкс", "grey", 9);

        System.out.println(cat1.getNameCat());
        cat1.setNameCat("Бакс");
        
    }
}
