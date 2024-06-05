package com.susan.execeptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show() {
        sayHello("susan");

        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            System.out.println("File opened");
            var value = reader.read();
            new SimpleDateFormat().parse("");

//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
////            ex.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not read data: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Parse error");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
