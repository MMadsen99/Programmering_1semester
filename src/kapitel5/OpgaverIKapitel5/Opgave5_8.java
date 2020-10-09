package kapitel5.OpgaverIKapitel5;

import java.util.Scanner;

public class Opgave5_8 {
    public static void main(String[] args) {
        System.out.println("Skriv dit navn og din score fra testen");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int score = scan.nextInt();
        System.out.println("Navn = " + name);
        System.out.println("Score = " + score);
    }
}
