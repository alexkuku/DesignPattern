package factory.factory;

import java.util.ArrayList;

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
