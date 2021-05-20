package com.shik;

import java.util.HashMap;

public class TransitionFunction {
    private final HashMap<Twin,Triplet> transitionTable;

    public TransitionFunction(){
        this.transitionTable = new HashMap<>();
    }

    public void add(String info){
        String[] data= info.split(" ");
        String[] part1= data[0].split(",");
        String[] part2= data[1].split(",");
        Twin current=new Twin( part1[0], part1[1]);
        Triplet next= new Triplet( part2[0], part2[1], part2[2]);
        this.transitionTable.put(current,next);
    }

    public Triplet getNextTransitionInfo(String state, String symbol){
        Twin twin= new Twin(state,symbol);

        Triplet triplet= transitionTable.get(twin);
        return triplet;
    }
    //prints the transition function in an okay manner for debugging
    public void printTransitionTable(){
        for (Twin i: transitionTable.keySet() ){
            System.out.println(i);
        }
        for (Triplet i: transitionTable.values()){
            System.out.println(i);
        }
    }
    @Override
    public String toString() {
        return "TransitionFunction{" +
                "transitionTable=" + transitionTable+
                '}';
    }
}

