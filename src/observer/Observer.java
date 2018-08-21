package observer;

/**
 * 观察者模式中的观察者
 */
public interface Observer {

    /**
     * 通过这个方法，被观察者实时的向观察者提供最新的数据。
     * 这是一种主动下推的方式。
     * @param subject
     */
    void update(Subject subject);
}
