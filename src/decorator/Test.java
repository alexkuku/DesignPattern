package decorator;

import decorator.beverage.DarkRoast;
import decorator.condiment.Milk;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("decorator.beverage.DarkRoast");
        Milk beverage = new Milk(new DarkRoast());

        System.out.println(beverage.beverage);
        System.out.println(beverage.beverage.description);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
