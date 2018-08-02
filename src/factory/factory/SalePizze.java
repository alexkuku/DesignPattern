package factory.factory;

import java.util.Stack;
import java.util.TreeMap;

public class SalePizze {

    public static void main(String[] args) {
        PizzaStore store = new StevePizzaStore();

        Pizza pizza = store.orderPizza("steve");

    }
}


