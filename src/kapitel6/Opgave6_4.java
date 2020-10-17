package kapitel6;

import java.util.Scanner;

public class Opgave6_4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int number = input.nextInt();
        System.out.println(reverse(number));
    }
    public static int reverse(int number) {

        String reverse = ""; 	// Holds reversed number
        String n = number + ""; // Convert number to string


        // Reverse string
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }

}
