package kapitel5.OpgaverIKapitel5;

public class Opgave5_5 {

    public static void main(String[] args) {
        System.out.println("Celsius \t\t Fahrenheit");
        System.out.println("------------------------");
        double j = 9 / 5.0 + 32;
        for (int i = 0; i < 11; i++) {

            System.out.println("\t" + i + " \t\t\t\t" + i * j);


        }
    }
}
