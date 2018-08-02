package decorator.beverage;

import decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
