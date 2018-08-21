package factory.factory;

import java.util.ArrayList;

/**
 * 工厂的产品
 * 这是一个抽象基类，相比较于接口，抽象类能写一些公共属性和方法
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    //ArrayList topping = new ArrayList();   //此处存疑

    void prepare() {
        System.out.println("prepareing " + name);
    }

    void bake() {
        System.out.println("bakeing...");
    }

    void cut() {
        System.out.println("cuting...");
    }

    void box() {
        System.out.println("boxinging...");
    }
}
