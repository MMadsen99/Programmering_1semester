package kapitel3.OpgaverIKapitel3;

import java.util.Scanner;

public class Opgave3_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for a : ");

        double a = scanner.nextDouble();

        System.out.println("Enter a value for b : ");

        int b = scanner.nextInt();

        System.out.println("Enter a value for c : ");

        int c = scanner.nextInt();

        if (-b + (Math.sqrt(Math.pow(b, 2) - 4 * (int)a * c)) / 2 * (int)a >= 1) {
            System.out.println("The equation has 2 roots");
        } else if (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a >= 0) {
            System.out.println("The equation has 1 root");
        } else {
            System.out.println("The equation has 0 roots");
        }
    }
}

