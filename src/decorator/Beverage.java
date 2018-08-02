package decorator;

/**
 * this is a base component
 */
public abstract class Beverage {
    public String description = "No Description";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
