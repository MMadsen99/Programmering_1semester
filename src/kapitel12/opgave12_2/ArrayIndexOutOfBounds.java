package kapitel12.opgave12_2;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an input between 1 and 12");
        System.out.println("To get the month and how many days that are in the month");
        int userInput = input.nextInt();
        // tilføjet en fill i begge arrays da de starter i 0 og ikke 1,
        String[] months = { "Error","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {0 ,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println(months[userInput] + " " + dom[userInput]);

    }
    public static void WrongNumber(){
        try{
        /*
            Code to run:
            A statement or a method that may throw an exception;
            More code to run;

         */

        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Only integers between 1 and 12");
        }
        System.out.println("The program continues ...");
    }
}
