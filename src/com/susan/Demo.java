package com.susan;
import com.susan.demos.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Demo {
    public static void mortgageCalculator() {

        System.out.println("----------------------------");
        System.out.println("Mortgage Calculator ");

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        float principal = scanner.nextFloat();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * ((monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments)))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

    public static void mortgageCalculatorV2() {

        System.out.println("----------------------------");
        System.out.println("Mortgage Calculator v2");

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while(true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();

            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while(true) {
            System.out.print("Period (Years): ");
            int years = scanner.nextInt();

            if ( years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value between 1 and 30");

        }

        double mortgage = principal
                * ((monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments)))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

    public static void fizzBuzz() {
        System.out.println("----------------------------");
        System.out.println("Fizz Buzz");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number: ");

        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

    }

    public static void demoAll() {
        PrimitiveDataTypes.primitiveDataTypes();
        ReferenceDataTypes.referenceDataTypes();
        ArrayMethods.arrayMethods();
        TypeCasting.typeCasting();
        MathMethods.mathMethods();
        FormattingNumbers.formattingNumbers();
        ReadingInputs.readingInputs();
        ConditionalStatements.conditionalStatement();
        Loops.loops();

        fizzBuzz();
        mortgageCalculator();
        mortgageCalculatorV2();
    }
}
