package singleton;

/**
 * 双重加锁方式的单例
 * 1.volatile，确保准确更新
 * 2.synchronized，确保线程安全
 */
public class Singleton {

    public static volatile Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
