package kapitel6;

import java.util.Scanner;

public class Opgave6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int number = input.nextInt();
        if (isPalindrome(number) == true){
            System.out.println(number + " is a palindrome");
        }else System.out.println(number + " is not a palindrome");

    }

//Return the reversal of an integer.. reverse(456) returns 654
public static int reverse(int number) {

    String reverse = ""; 	// Holds reversed number
    String n = number + ""; // Convert number to string


    // Reverse string
    for (int i = n.length() - 1; i >= 0; i--) {
        reverse += n.charAt(i);
    }
    return Integer.parseInt(reverse);
}
//Return true if number is a palindrome ( hvis det er samme begge veje som 101, 22
public static boolean isPalindrome(int number) {

    return number == reverse(number);
}
}