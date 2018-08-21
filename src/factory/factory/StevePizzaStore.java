package factory.factory;


public class StevePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("steve")) {
            return new SteveStandardPizza();
        }
        return null;
    }
}
