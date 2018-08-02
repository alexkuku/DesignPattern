package decorator.condiment;

import decorator.Beverage;
import decorator.Condiment;

public class Mocha extends Condiment {
    //被装饰的对象
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
