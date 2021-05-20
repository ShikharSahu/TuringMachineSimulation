package com.shik;

import java.util.ArrayList;
import java.util.Arrays;

public class Tape {
    private ArrayList<String> tapeList;
    private int currentPosition=0; // this is the tape header
    private String blankSymbol="!";

    public Tape(String tape, String blankSymbol){
        // converts the string into a string array by splitting it after each character
        // then converts the array into an Array list
        // there has to be a better way to do this
        this.tapeList=new ArrayList<>(Arrays.asList(tape.split("")));
        // if the user doesn't enter a blank symbol, we take the default blank symbol
        if(blankSymbol != null){
            this.blankSymbol=blankSymbol;
        }
        // adding two blank characters at the end of the string, more will be added automatically
        tapeList.add(this.blankSymbol);
        tapeList.add(this.blankSymbol);
    }

    //use used to move the tape header and the tape values
    // think of method name as translate related to movement
    public void translate(String changeTo, String direction){
        // change the current cell and the header position
        tapeList.set(currentPosition, changeTo);
        if (direction.equals("L")){
            if(currentPosition!=0){
                currentPosition--;
            }
        }
        else {
            currentPosition++;
            // if we have reached to the end of the tape, increment it's size with blank symbols
            if(tapeList.size()<currentPosition){
                tapeList.add(blankSymbol);
                tapeList.add(blankSymbol);
            }
        }
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    // returns the symbol pointed by the header
    public String currentSymbol(){
        return tapeList.get(currentPosition);
    }

    //displays the tape
    public void displayTape(){
        StringBuilder stringBuilder= new StringBuilder();
        for ( String x: tapeList){
            stringBuilder.append(x);
        }
        System.out.println(stringBuilder);
    }
}
