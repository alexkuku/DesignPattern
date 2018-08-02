package observer;

/**
 * 观察者模式中被观察的主题
 */
public interface Subject {
    /**
     * register an observer
     */
    void registerObserver(Observer observer);

    /**
     * remove an observer
     */
    void removeObserver(Observer observer);

    /**
     * notify the latest information to all observers
     */
    void notifyObserver();
}
