package com.example;

// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

/**
 * print Hello world and data, time
 *
 */
// public class App 
// {
//     public static void main(String[] args)
//     {
//         System.out.println ("Hello World!");
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("dd.MM.yyyy HH:mm:ss");
//         System.out.println(LocalDateTime.now().format(formatter));
//     }
// }

/**
 * Написать программу, которая запросит пользователя ввести <Имя> в консоли
 * Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"
 */

import java.util.Scanner;

 public class App 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        // System.out.println("Привет, " + name + "!");
        System.out.println(String.format ("Привет, %s!", name));
        scanner.close();
    }
}