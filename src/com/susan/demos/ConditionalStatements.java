package com.susan.demos;
import java.util.Scanner;

public class ConditionalStatements {
    public static void conditionalStatement() {

        System.out.println("----------------------------");
        System.out.println("Conditional Statements ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature: ");
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }

        int income = 105_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println("hasHighIncome: " + hasHighIncome);

        System.out.println("Ternary Operator");
        String className = (income > 100_000) ? "First" : "Economy";
        System.out.println("Class Name: " + className);

        System.out.println("Switch Statement");
        String role = "admin";

        switch(role) {
            case "admin":
                System.out.printf("You're an admin");
                break;

            case "moderator":
                System.out.printf("You're a moderator");
                break;

            default:
                System.out.printf("You're a guest");
        }

    }
}
