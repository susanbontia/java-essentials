package com.susan.demos;
import java.util.Scanner;

public class Loops {
    public static void loops() {
        System.out.println("----------------------------");
        System.out.println("For Loop");
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello World: " + i);
        }

        System.out.println();
        System.out.println("While Loop");
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("quit")) {

            System.out.printf("Type 'quit' to exit: ");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("quit")) {
                break;
            }
            if (input.equals("pass")) {
                continue;
            }
            System.out.println(input);
        }

        while (true) {

            System.out.printf("Type 'q' to exit: ");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("q")) {
                break;
            }
            if (input.equals("pass")) {
                continue;
            }
            System.out.println(input);
        }

        System.out.println();
        System.out.println("Foreach Loop");
        String[] fruits = {"Apple" , "Mango", "Orange"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println();
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
