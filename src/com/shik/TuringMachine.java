package com.shik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TuringMachine {
    private String initialState,blankSymbol;
    private Tape tape;
    private TreeSet<String> symbols, tapeSymbols, finalStates, allStates;
    private String currentState;
    private TransitionFunction transitionFunction;
    private boolean isHalted=false;

    private String[] readFileLine(Scanner scanner){
        String string = scanner.nextLine();
        return string.split(" ");
    }

    private TreeSet<String> addToSet(Scanner scanner){
        String [] strings= readFileLine(scanner);
        TreeSet<String> treeSet=new TreeSet<>();
        for (int i=1; i<strings.length;i++ ){
            treeSet.add(strings[i]);
        }
        return treeSet;
    }

    public TuringMachine(String filename) throws FileNotFoundException {
        File inputFile = new File(filename);
        Scanner scanner = new Scanner(inputFile);
        scanner.nextLine();

        initialState=readFileLine(scanner)[1];
        String[] blank_test=readFileLine(scanner);
        if(blank_test.length>1)
        blankSymbol=blank_test[1];
        tape=new Tape(readFileLine(scanner)[1],blankSymbol);

        symbols= addToSet(scanner);
        tapeSymbols=addToSet(scanner);
        finalStates=addToSet(scanner);
        allStates=addToSet(scanner);

        int numberOfEntries = Integer.parseInt(readFileLine(scanner)[2]);
        scanner.nextLine();
        transitionFunction = new TransitionFunction();
        for (int i=0;i<numberOfEntries;i++){
            transitionFunction.add(scanner.nextLine());
        }

        currentState=initialState;
    }

    //returns true while the machine is not halted
    public boolean turn(){
        tape.displayTape();
        //try putting the code between start and end, near the end of the code if some issue persists
        //start
        if (finalStates.contains(currentState)){
            //if we get into a final state, the machine is now halted.
            isHalted=true;
            System.out.println("In Accept State...");
            return false;
        }
        //end
        if(!isHalted){
            Triplet next_turn= transitionFunction.getNextTransitionInfo(currentState, tape.currentSymbol());
            if (next_turn!=null) {
                tape.translate(next_turn.getChangeTo(), next_turn.getDirection());
                currentState = next_turn.getNextState();
            }
            else {
                //if we transition to a state that does not have any valid transition to any state,
                // that means we have then entered the DEAD\REJECT state
                isHalted=true;
                System.out.println("In Reject State...");
                return false;
            }
        }
        return true;
    }
    public void displayTape(){
        tape.displayTape();
    }

    //a toString function for debugging
    @Override
    public String toString() {
        return "TuringMachine{" +
                "initialState='" + initialState + '\'' +
                ", blankSymbol='" + blankSymbol + '\'' +
                ", tape=" + tape +
                ", symbols=" + symbols +
                ", tapeSymbols=" + tapeSymbols +
                ", finalStates=" + finalStates +
                ", allStates=" + allStates +
                ", currentState='" + currentState + '\'' +
                ", transitionFunction=" + transitionFunction +
                '}';
    }
}
