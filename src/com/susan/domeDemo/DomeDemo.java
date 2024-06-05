package com.susan.domeDemo;

import java.util.List;

public class DomeDemo {
    public static void show() {
        IceCreamMachine machine = new IceCreamMachine(
                new String[]{"vanilla", "chocolate", "strawberry"},
                new String[]{"chocolate sauce"});

        List<IceCreamMachine.IceCream> scoops = machine.scoops();

        IceCreamMachine machine2 = new IceCreamMachine(
                new String[]{},
                new String[]{"chocolate sauce"});

        List<IceCreamMachine.IceCream> scoops2 = machine2.scoops();

        /*
         * Should print:
         * vanilla, chocolate sauce
         * chocolate, chocolate sauce
         */
        for (IceCreamMachine.IceCream iceCream : scoops) {
            System.out.println(iceCream.ingredient + ", " + iceCream.topping);
        }

        for (IceCreamMachine.IceCream iceCream : scoops2) {
            System.out.println(iceCream.ingredient + ", " + iceCream.topping);
        }
    }
}
