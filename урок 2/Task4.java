import java.io.FileWriter;
import java.io.IOException;

// Метод, который составит строку, состоящую из ста повторений слова "тест"

public class Task4 {
    public static void main(String[] args) {
        String str = "тест";
        System.out.println(test(str));
        writeFile(test(str));
    }

    private static String test (String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            builder.append(str);
        }
        return builder.toString();
    }

    private static void writeFile (String str) {
        try (FileWriter writer = new FileWriter("тест.txt", false)) {
            writer.write(str);
            writer.flush();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}