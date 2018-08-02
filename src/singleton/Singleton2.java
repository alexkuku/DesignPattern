package singleton;

/**
 * 直接实例化，占用空间。
 */
public class Singleton2 {

    public static Singleton2 instance = new Singleton2();

    private Singleton2() {}
}
