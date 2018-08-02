package decorator.beverage;

import decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
