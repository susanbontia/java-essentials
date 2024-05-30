package com.susan.demos;
import java.util.Scanner;

public class ReadingInputs {
    public static void readingInputs() {
        System.out.println("----------------------------");
        System.out.println("Reading Input");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine().trim();
        System.out.println("Your name is : " + name);
        System.out.print("Age: ");
        byte newAge = scanner.nextByte();
        System.out.println("YOu are " + newAge + " years old");
    }
}
