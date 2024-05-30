package com.susan.demos;

public class TypeCasting {
    public static void typeCasting() {
        System.out.println("----------------------------");
        System.out.println("Casting");
        String x = "3";
        int sum = Integer.parseInt(x) + 2;
        System.out.println(sum);

        String y = "4.2";
        double product = Double.parseDouble(y) * 2;
        System.out.println(product);
    }
}
