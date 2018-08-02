package singleton;

/**
 * 最简单粗暴的方式，性能低下。
 */
public class Singleton3 {

    public static Singleton3 instance;

    private Singleton3() {}

    public synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
