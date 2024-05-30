package com.susan.demos;

public class MathMethods {
    public static void mathMethods() {
        System.out.println("----------------------------");
        System.out.println("Math methods");
        int a = Math.round(2.9F);
        System.out.println("round: " + a);

        double b = Math.random();
        System.out.println("random: " + b);

        int c = (int)Math.ceil(7.4F);
        System.out.println("ceil: " + c);

        double d = Math.floor(9.7);
        System.out.println("floor: " + d);

        int e = Math.max(5,10);
        System.out.println("max: " + e);

        int f = Math.min(99,65);
        System.out.println("min: " + f);

        int g = (int)Math.round(Math.random() * 100);
        System.out.println("round & random: " + g);
    }
}
