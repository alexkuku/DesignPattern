package factory.simpleFactory;

/**
 * 具体的简单工厂
 */
public class SimplePizzaFactory {

    /**
     * 根据类型实例不同的pizza
     * @param type
     * @return
     */
    Pizza createPizza(String type) {
        return null;//此处应根据type，new Pizza的具体实现类
    }
}
