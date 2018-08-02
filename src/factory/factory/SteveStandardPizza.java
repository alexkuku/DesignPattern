package factory.factory;

public class SteveStandardPizza extends Pizza {

    public SteveStandardPizza() {
        this.name = "steve";
    }

    public void bake() {
        System.out.println("Steve bake");
    }

}
