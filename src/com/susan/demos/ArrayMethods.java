package com.susan.demos;

public class ArrayMethods {
    public static void arrayMethods() {
        System.out.println("----------------------------");

        int[] numbers = new int[5];
        int[] numbersArray = { 5, 4, 7, 3, 9, 17 };
        java.util.Arrays.sort(numbersArray);
        System.out.println("Arrays");
        System.out.println(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(java.util.Arrays.toString(numbersArray));
        System.out.println(numbersArray.length);

        System.out.println("----------------------------");
        System.out.println("Multidimensional Arrays");
        int[][] scores = new int[3][5];
        int[][] scoresArray = {{23,5,16,45,23}, {11,44,22,55,33}, {23,17,54,87,12}};

        System.out.println(java.util.Arrays.deepToString(scores));
        System.out.println(java.util.Arrays.deepToString(scoresArray));
    }
}
