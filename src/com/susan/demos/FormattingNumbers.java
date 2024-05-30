package com.susan.demos;
import java.text.NumberFormat;

public class FormattingNumbers {
    public static void formattingNumbers() {
        System.out.println("----------------------------");
        System.out.println("Formatting numbers");
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(23455.876);
        System.out.println("currency: " + result);

        String percentResult = NumberFormat.getPercentInstance().format(.5);
        System.out.println("percentage: " + percentResult);
    }
}
