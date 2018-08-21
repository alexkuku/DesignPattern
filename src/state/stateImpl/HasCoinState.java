package state.stateImpl;

import state.CandyMachine;
import state.State;

public class HasCoinState extends State {
    public HasCoinState(CandyMachine candyMachine) {
        super(candyMachine);
    }

    public String insertCoin() {
        return "You've insert one coin";
    }


    public String ejectCoin() {
        if (candyMachine.getCoinNumber() == 0) {
            this.candyMachine.setCurrentState(candyMachine.getNoCoinState());
        }
        return "One coin ejected!";
    }


    public String pressButton() {
        candyMachine.setCurrentState(candyMachine.getSoldState());
        return "Ready to launch candy!";
    }


}
