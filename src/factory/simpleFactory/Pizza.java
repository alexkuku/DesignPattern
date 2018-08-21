package factory.simpleFactory;

/**
 * 简单工厂的产品
 * 不同类型的pizza继承这个接口，pizza工厂然后根据各个pizza的type去生产（即实例化）不同的pizza
 */
public interface Pizza {

    void prepare();
    void bake();
    void cut();
    void box();

}
