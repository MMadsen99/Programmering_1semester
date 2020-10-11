package kapitel5.OpgaverIKapitel5.Opgave5_2;


import java.util.Scanner;

public class Opgave5_2Funktion {
    public static void Funktion() {

        for (int i = 0; i < 5; i++) {

        double Number1 = (int)(10.0 * Math.random());
        double Number2 = (int)(12.0 * Math.random());
        double answer = (int)Number1 - (int)Number2;

        System.out.println("Hvad er " + (int)Number1 + " minius " + (int)Number2 + "?");
        Scanner input = new Scanner(System.in);

        if (answer == input.nextInt()) {
            System.out.println("Det er rigtigt");
        } else System.out.println("Det er forkert");
            System.out.println("*********************");
    }
        return;
    }
}
