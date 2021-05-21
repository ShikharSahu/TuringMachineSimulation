# Turing Machine Simulator

## Introduction:
This is the simulation of Turing Machine using plain java and no extra frameworks. It takes the input from a files mentioned in the code and processes the result as if it were a Turing Machine.

## How to use it
1. Clone the repository and set up your enviroment.
2. In the Main class, set the proper file location input file to your Turing Machine to read the input.
3. Three input files have been attached but you may create more input files as per your requirements.
4. Now you can easily run the turing machine as per your requirement.

## How to create input files:
1. create a text file and fill the information as per the given input files.
2. In the transition function "A,0 B,1,R", it means that on the input zero, the state will change from A to B and 0 will be changed to 1 and the tape header will move right.
3. Reject state need not be mentioned, since any case of input not resulting to proper tansition table output will be marked to the reject state.

## Things to pay attention to:
+ Tape and input symbols can only be UTF-16 characters.
+ Names of states can be strings.
+ In the input files, make sure proper indentation is followed and no line does not have any extra whitespace, especially at the end.

## Explaination of Classes:
***Detailed information about the working of the classes has been provided as comments ain their respective Java files***-
+ **Main Class:**
It has been used to demonstrate the working of the turing machine.
+ **Turing Machine:**
It the Turing Machine class and it can be instantiated as a Turing Machine model.
+ **Transition Function:**
It uses hashmaps to symbolize the transition function
+ **Tape:**
It is the tape used in turing machines. It has it's own header and can be easily interfaced using methods.
+ **Twin and Triplet:**
They are basically container to store the information about the transition function so that they can be easily mapped.
