package com.susan.demos;
import java.awt.*;
import java.util.Date;

public class ReferenceDataTypes {
    public static void referenceDataTypes(){

        System.out.println("----------------------------");
        Date now = new Date();
        System.out.println("Reference Data Types");
        System.out.println("Date: " + now);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 5;

        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);

        String message = "   Hello Java World !!   ";
        System.out.println("Strings: ");
        System.out.println("String: " + message);
        System.out.println("length: " + message.length());
        System.out.println("replace: " + message.replace("!", "*"));
        System.out.println("indexOf:" + message.indexOf("J"));
        System.out.println("toUpperCase: " + message.toUpperCase());
        System.out.println("toLowerCase: " + message.toLowerCase());
        System.out.println("trim: " + message.trim());
    }
}
