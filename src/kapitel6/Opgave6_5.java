package kapitel6;

import java.util.Scanner;

public class Opgave6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();


        displaySortedNumbers(num1,num2,num3);
    }

public static void displaySortedNumbers(double num1, double num2, double num3){

        double tempNumber;
        double tempNumber2;
    if (num1 > num2 && num2 > num3) {

        System.out.println(num1 + " " + num2 + " " + num3);
}
    if (num2 > num1 && num1 > num3){//2  1  3
        tempNumber = num1;
        num1 = num2;
        num2 = tempNumber;

    }
    if (num3 > num2){ // 3 2 1
        tempNumber = num3;
        num3 = num1;
        num1 = tempNumber;
        tempNumber2 = num3;
        num3 = num2;
        num2 = tempNumber2;
    }
    System.out.println(num1 + " " + num2 + " " + num3);
}
}