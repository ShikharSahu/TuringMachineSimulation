package com.shik;

public class Main {

    public static void main(String[] args) {
        try {
            //location where input file is saved
            TuringMachine turingMachine= new TuringMachine("D:\\javastuff\\flat_assignment\\file1.txt");
            //makes the turing machine run until it halts
            while (turingMachine.turn());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
