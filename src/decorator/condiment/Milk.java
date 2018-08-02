package decorator.condiment;

import decorator.Beverage;
import decorator.Condiment;

public class Milk extends Condiment {

    public Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
