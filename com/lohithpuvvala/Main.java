package com.lohithpuvvala;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("--------------------------------------------------");
            System.out.println("|       Welcome to Java Console Calculator       |");
            System.out.println("--------------------------------------------------");

            Scanner in = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            double a = in.nextDouble();
            System.out.print("Enter an integer: ");
            double b = in.nextDouble(); in.nextLine();
            System.out.print("Enter the Operation to Perform:\n" +
                    " + : Addition Operation\n" +
                    " - : Subtraction Operation\n" +
                    " * : Multiplication Operation\n" +
                    " / : Division Operation\n" +
                    " % : Modulus Operation\n" +
                    "Choose any one option: ");
            String op = in.nextLine();
            double result = 0;

            boolean valid = true;
            switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/":
                    if(b != 0) {
                        result = a / b;
                    }else{
                        System.out.println("Error: Division by zero is not allowed.");
                        valid = false;
                    }
                    break;
                case "%": if(b != 0){
                    result = a % b;
                }else{
                    System.out.println("Error: Modulus by zero is not allowed.");
                    valid = false;
                } break;
                default:
                    System.out.println("Error: Invalid Operation entered.");
                    valid = false;
            }

            if(valid) System.out.printf("Result: %.3f %s %.3f = %.3f \n",a,op,b,result);
            System.out.println("To quit the program, enter 'q'. Press any other key to reload the calculator: ");
            char quit = in.next().charAt(0);
            if(quit == 'q' || quit == 'Q') break;
        }
    }
}