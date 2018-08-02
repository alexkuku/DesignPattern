package decorator;

/**
 * **Decorator**
 * use this to decorate our components,but decorator class should also be a component for us to decorate this.
 * So that we can use mutible methods to combine components and decorator
 */
public abstract class Condiment extends Beverage{


    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
