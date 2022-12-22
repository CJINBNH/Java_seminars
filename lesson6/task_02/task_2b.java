import java.time.LocalDate;
import java.time.Month;

public class task_2b {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", "сфинкс", "grey", LocalDate.of(2021, Month.AUGUST, 15), "Петров");
        Cat bars = new Cat("Bars", "ангорка", "white", LocalDate.of(2018, Month.FEBRUARY, 3), "Иванов");

        tom.addAward(new Award("Best color 2022", "Москва", 2022, "2st"));
        tom.addAward(new Award("Самый шершавый кот", "Хабаровск", 2022, "1st"));
        bars.addAward(new Award("Самый пушистый", "Оренбуг", 2022, "1st"));

        System.out.println(tom);
        System.out.println(bars);

    }
}
