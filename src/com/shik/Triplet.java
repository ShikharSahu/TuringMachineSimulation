package com.shik;
// a class to act as a container for values for their easy transfer
public class Triplet{
    private String nextState,changeTo,direction;
    public Triplet(String nextState, String changeTo, String direction) {
        this.nextState = nextState;
        this.changeTo = changeTo;
        this.direction = direction;
    }

    public String getNextState() {
        return nextState;
    }

    public String getChangeTo() {
        return changeTo;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "nextState='" + nextState + '\'' +
                ", changeTo='" + changeTo + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
