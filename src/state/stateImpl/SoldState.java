package state.stateImpl;

import state.CandyMachine;
import state.State;

public class SoldState extends State {
    public SoldState(CandyMachine candyMachine) {
        super(candyMachine);
    }

    @Override
    public String insertCoin() {
        return "You've insert one coin";
    }

    @Override
    public String ejectCoin() {
        return "Please wait...";
    }

    @Override
    public String pressButton() {
        candyMachine.launchCandy();
        if (candyMachine.getCandyNumber() == 0) {
            candyMachine.setCurrentState(candyMachine.getSoldOutState());
            return "";
        }
        if (candyMachine.getCandyNumber() > 0) {
            candyMachine.setCurrentState(candyMachine.getHasCoinState());
            return "";
        }
        candyMachine.setCurrentState(candyMachine.getNoCoinState());
        return "";
    }


}
