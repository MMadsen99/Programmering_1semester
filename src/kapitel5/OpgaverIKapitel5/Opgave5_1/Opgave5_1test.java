package kapitel5.OpgaverIKapitel5.Opgave5_1;

import java.util.Scanner;

public class Opgave5_1test {
    // testcase 1, input -1
    // expected output = you failed the exxam
    public static void main(String[] args) {
        System.out.println(" testcase 1, input -1");
        Scanner hej = new Scanner(System.in);
        int javaScore = hej.nextInt();

        if (javaScore == -1) System.out.println(" The test worked");
        else System.out.println(" the test failed");



}

static class Opgave5_1test2 {
    // testcase 2, input 101
    // expected input = you failed the exam
    public static void main(String[] args) {
        System.out.println(" testcase 2, input 101");
        Scanner hej = new Scanner(System.in);
        int javaScore = hej.nextInt();

        if (javaScore == 101) System.out.println(" The test worked");
        else System.out.println(" the test failed");

    }

}
static class Opgave5_1test3 {
    // testcase 3, input 59
    // expected input = you failed the exam
    public static void main(String[] args) {
        System.out.println(" testcase 3, input 59");
        Scanner hej = new Scanner(System.in);
        int javaScore = hej.nextInt();

        if (javaScore == 59) System.out.println(" The test worked");
        else System.out.println(" the test failed");

    }
}
}
