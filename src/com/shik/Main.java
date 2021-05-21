package com.shik;

public class Main {

    public static void main(String[] args) {
        try {
            //location where input file is saved
            //add a location relative to your own device
            TuringMachine turingMachine= new TuringMachine("D:\\javastuff\\file3.txt");
            //makes the turing machine run until it halts
            while (turingMachine.turn());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
