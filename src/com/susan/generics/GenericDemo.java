package com.susan.generics;

public class GenericDemo {
    public static void show() {
        var list = new List();
        list.add(1);
        list.add("2");
        list.add(new User());

        var intList = new GenericList<Integer>();
        intList.add(38);

        var userList = new GenericList<User>();
        userList.add(new User());

    }
}
