package state.stateImpl;

import state.CandyMachine;
import state.State;

public class NoCoinState extends State {

    public NoCoinState(CandyMachine candyMachine) {
        super(candyMachine);
    }

    @Override
    public String insertCoin() {
        candyMachine.setCurrentState(candyMachine.getHasCoinState());
        return "You've insert one coin!";
    }

    @Override
    public String ejectCoin() {
        return "No coin to eject!";
    }

    @Override
    public String pressButton() {
        return "Please insert coins!";
    }


}
