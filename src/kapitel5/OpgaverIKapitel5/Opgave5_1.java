package kapitel5.OpgaverIKapitel5;

import java.util.Scanner;

public class Opgave5_1 {
    public static void main(String[] args) {
        System.out.println("Whats your Java score?");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x >= 60) System.out.println("You passed the exam");
        if (x< 0 || x > 101) System.out.println("Error : only number between 0-100");
        if (x <= 59 && x >= 0 ) System.out.println("You have failed the exam");
    }
}
