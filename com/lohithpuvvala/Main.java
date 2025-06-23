package com.lohithpuvvala;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        while(true) {
            //Display Calculator Header
            System.out.println("--------------------------------------------------");
            System.out.println("|       Welcome to Java Console Calculator       |");
            System.out.println("--------------------------------------------------");

            //Create a Scanner Object to read user Input.
            Scanner in = new Scanner(System.in);

            //Prompt the User for the first Input
            System.out.print("Enter an integer: ");
            double a = in.nextDouble();

            //Prompt the User for the Second Input
            System.out.print("Enter an integer: ");
            double b = in.nextDouble();
            in.nextLine(); // Consume leftover newline character.

            //Prompt the user for an arthemetic operation
            System.out.print("""
                    Enter the Operation to Perform:
                     + : Addition Operation
                     - : Subtraction Operation
                     * : Multiplication Operation
                     / : Division Operation
                     % : Modulus Operation
                    Choose any one option:\s""");
            String op = in.nextLine();

            double result = 0;// Stores result
            boolean valid = true;// Flag to track if operation is valid or Not.

            //Selected Operation will be performed.
            switch (op) {
                case "+": result = addition(a,b); break;
                case "-": result = subtraction(a,b); break;
                case "*": result = multiplication(a,b); break;
                case "/":
                    //check for division by zero.
                    if(b != 0) {
                        result = division(a,b);
                    }else{
                        System.out.println("Error: Division by zero is not allowed.");
                        valid = false;
                    }
                    break;
                case "%":
                    //check for modulus by zero.
                    if(b != 0){
                    result = modulus(a,b);
                }else{
                    System.out.println("Error: Modulus by zero is not allowed.");
                    valid = false;
                } break;
                default:
                    //Handle invalid operator input
                    System.out.println("Error: Invalid Operation entered.");
                    valid = false;
            }

            // Displays the result only if the operation is valid.
            if(valid) System.out.printf("Result: %.3f %s %.3f = %.3f \n",a,op,b,result);

            //Ask the user if they want to quit or continue.
            System.out.println("To quit the program, enter 'q'. Press any other key to reload the calculator: ");
            char quit = in.next().charAt(0);
            if(quit == 'q' || quit == 'Q') break;// Exit the loop if user enters 'q' or 'Q'
        }
    }

    static double addition(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }

    static double modulus(double a, double b) {
        return a % b;
    }
}