package com.susan.domeDemo;

import java.util.ArrayList;
import java.util.List;

public class IceCreamMachine {
    public String[] ingredients;
    public String[] toppings;

    public static class IceCream {
        public String ingredient;
        public String topping;

        public IceCream(String ingredient, String topping) {
            this.ingredient = ingredient;
            this.topping = topping;
        }
    }

    public IceCreamMachine(String[] ingredients, String[] toppings) {
        this.ingredients = ingredients;
        this.toppings = toppings;
    }

    public List<IceCream> scoops() {

        try {
            List<IceCream> iceCreamList = new ArrayList<>();


            System.out.println("ingredients.length: " + this.ingredients.length);
            System.out.println("toppings.length: " + this.toppings.length);

            if (this.ingredients == null || this.ingredients.length == 0 ||
                this.toppings == null || this.toppings.length == 0) {
                System.out.println("Empty Array");
                return iceCreamList;
            }

            for(String ingredient: this.ingredients) {
                for (String topping: this.toppings) {
                    iceCreamList.add(new IceCream(ingredient, topping));
                }
            }


            return  iceCreamList;

        } catch (Error e) {
            throw new UnsupportedOperationException("Waiting to be implemented");
        }

    }
}
