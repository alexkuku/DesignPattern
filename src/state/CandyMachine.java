package state;

import state.stateImpl.HasCoinState;
import state.stateImpl.NoCoinState;
import state.stateImpl.SoldOutState;
import state.stateImpl.SoldState;

public class CandyMachine {
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State soldOutState;

    private State currentState = soldOutState;
    private int candyNumber = 0;
    private int coinNumber = 0;

    public CandyMachine (int candyNumbers) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        this.candyNumber = candyNumbers;
        if (this.candyNumber > 0) {
            currentState = noCoinState;
        }
    }

    public String insertCoin() {
        coinNumber ++;
        return currentState.insertCoin();
    }

    public String ejectCoin() {
        if (coinNumber != 0) {
            coinNumber --;
        }
        return currentState.ejectCoin();
    }

    public String pressButton() {
        currentState.pressButton();
        return currentState.pressButton();
    }

    public String launchCandy() {
        if (candyNumber != 0) {
            candyNumber --;
        }
        coinNumber --;
        return "Launching a candy!";
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCandyNumber() {
        return candyNumber;
    }

    public int getCoinNumber() {
        return coinNumber;
    }
}
