package com.shik;

import java.util.ArrayList;
import java.util.Arrays;

public class Tape {
    private ArrayList<String> tapeList;
    private int currentPosition=0;//this is the tape header
    private String blankSymbol="!";

    public Tape(String tape, String blankSymbol){
        this.tapeList=new ArrayList<>(Arrays.asList(tape.split("")));
        if(blankSymbol != null){
            this.blankSymbol=blankSymbol;
        }
        tapeList.add(blankSymbol);
        tapeList.add(blankSymbol);
    }
    public void translate(String changeTo, String direction){
        tapeList.set(currentPosition, changeTo);
        if (direction.equals("L")){
            if(currentPosition!=0){
                currentPosition--;
            }
        }
        else {
            currentPosition++;
            if(tapeList.size()<currentPosition){
                tapeList.add(blankSymbol);
                tapeList.add(blankSymbol);
            }
        }
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
    public String currentSymbol(){
        return tapeList.get(currentPosition);
    }

    public void displayTape(){
        StringBuilder stringBuilder= new StringBuilder();
        for ( String x: tapeList){
            stringBuilder.append(x);
        }
        System.out.println(stringBuilder);
    }

}
