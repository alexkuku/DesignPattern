package state;

/**
 * 状态模式的抽象基类
 * 1.在状态模式中，各个状态都抽象成为一个类，并实现所有的行为操作
 * 2.对于某些状态来说，有些行为可能是多余的
 */
public abstract class State {
    protected CandyMachine candyMachine;

    public State(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    /**
     * 投入一个币
     */
    public abstract String insertCoin();

    /**
     * 退回一个币
     */
    public abstract String ejectCoin();

    /**
     * 按下开始按钮
     */
    public abstract String pressButton();


}
