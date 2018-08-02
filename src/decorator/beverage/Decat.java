package decorator.beverage;

import decorator.Beverage;

public class Decat extends Beverage {

    public Decat() {
        this.description = "Decat";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
