package state.stateImpl;

import state.CandyMachine;
import state.State;

public class SoldOutState extends State {
    public SoldOutState(CandyMachine candyMachine) {
        super(candyMachine);
    }

    @Override
    public String insertCoin() {
        return "You've insert one coin";
    }

    @Override
    public String ejectCoin() {
        if (candyMachine.getCoinNumber() > 0) {
            return "One coin ejected!";
        } else {
            return "There is no coin inserted!";
        }
    }

    @Override
    public String pressButton() {
        return "Sorry, candy sold out!";
    }


}
