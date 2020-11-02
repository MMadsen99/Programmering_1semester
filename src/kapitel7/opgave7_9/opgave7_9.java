package kapitel7.opgave7_9;

import java.util.Arrays;
import java.util.Scanner;

public class opgave7_9 {
    //flyttes til 1 semester programmerings opgaver når github virker
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] tenNumbers = new double[10];

        System.out.print("Enter 10 double inputs: ");
        for (int i = 0; i < tenNumbers.length; i++) {
            tenNumbers[i] = input.nextDouble();

        }


        max(tenNumbers);
        System.out.println("The biggest element in the array is " + max(tenNumbers));
    }


    public static double max(double[] tenNumbers ) {

        double max = tenNumbers[0];
        for (int i = 0; i < 10; i++) {
            if (tenNumbers[i] > max)
                max = tenNumbers[i];
        }

        return max;
    }

}
