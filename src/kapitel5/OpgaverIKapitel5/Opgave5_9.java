package kapitel5.OpgaverIKapitel5;

import java.util.Scanner;

public class Opgave5_9 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hvor mange studenter er der");
        int numberOfStudents = input.nextInt();
        int score;
        String name = " ";

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(
                    "Student: " + (i + 1) + "\n   Name: ");
            name = input.next();
            System.out.print("   Score: ");
            score = input.nextInt();

        }


    }
}
