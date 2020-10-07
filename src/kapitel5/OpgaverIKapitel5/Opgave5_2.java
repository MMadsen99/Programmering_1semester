package kapitel5.OpgaverIKapitel5;


import java.util.Scanner;

public class Opgave5_2 {
    public static void main(String[] args) {
        double Number1 = Math.random() * 100;
        double Number2 = Math.random() * 100;
        double svar = ((int)Number1 - (int)Number2);

        System.out.println("Hvad er " + (int)Number1 + "minius " + (int)Number2 + "?");

        Scanner input = new Scanner(System.in);

        if (input.nextInt() == svar)
            System.out.println("Du regnede rigtigt");


        while (input.nextInt() != (int)svar) {

            System.out.println(" Prøv igen");
        }
    }
}
