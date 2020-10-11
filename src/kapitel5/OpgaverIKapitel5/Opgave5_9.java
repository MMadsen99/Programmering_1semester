package kapitel5.OpgaverIKapitel5;

import java.util.Scanner;

public class Opgave5_9 {


    public static void main(String[] args) {
        Scanner StudentsNumber = new Scanner(System.in); // input fra brugeren ( hvor mange elever der er)
        Scanner name = new Scanner(System.in); // får input fra brugeren (navene på eleverne)

        System.out.println("Hvor mange studenter er der? ");

        int numberOfStudents = StudentsNumber.nextInt();
        String Studentnames = " ";


        System.out.println("Hvad hedder studenterne?");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(
                    "Student: " + (i + 1) + "\n   Name: ");
            name = name.next();
            System.out.print("   Score: ");



        }


        System.out.println("der er" + numberOfStudents + "Studerende" + " og deres navne er" + Studentnames);


    }
}
