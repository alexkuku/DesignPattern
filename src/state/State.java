package state;

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
