package com.susan.lambdas;

import java.awt.*;

public class LambdaDemo {
    public static String prefix="-";

    public void print(String message) {}

    public static void show() {
//        greet(new ConsolePrinter());

        greet((message) -> {
            System.out.println(message);
        });

        greeting(message -> System.out.println(prefix + message.toUpperCase()));

        // Class/Object::method - method reference
        greeting(System.out::println);

        var demo = new LambdaDemo();
        greeting(message -> demo.print(message));
        greeting(demo::print);
    }

    public static void greet(Printer printer) {
        printer.print("Hello Worlds!");
    }

    public static void greeting(Printer printer) {
        printer.print("Greetings: Hello Java World");

    }
}
