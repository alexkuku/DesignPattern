package observer;

/**
 * 这个接口与观察者模式没有直接联系，是使用策略模式，作为一种被独立出来的行为
 */
public interface DisplayElement {

    /**
     * 显示器显示的内容
     */
    void display();
}
