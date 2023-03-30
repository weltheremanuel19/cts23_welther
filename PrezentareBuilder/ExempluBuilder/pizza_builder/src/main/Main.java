//Clasa Main - conține metoda main care utilizează obiectele PizzaBuilder și Pizzer pentru a construi și afișa două instanțe de Pizza.
package main;

import clase.Pizza;
import clase.PizzaBuilder;
import clase.Pizzer;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizzer pizzer = new Pizzer();
        pizzer.pregaTesteazaPizza(pizzaBuilder);
        Pizza pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.toString());

        pizzaBuilder = new PizzaBuilder();
        pizzer.pregaHawaiianPizza(pizzaBuilder);
        pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.toString());
    }
}
