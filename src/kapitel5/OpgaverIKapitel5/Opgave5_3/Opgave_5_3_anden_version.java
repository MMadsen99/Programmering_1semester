package kapitel5.OpgaverIKapitel5.Opgave5_3;

public class Opgave_5_3_anden_version {
    public static void main(String[] args) {
        //overskriften
        System.out.println("Celsius \t\t\tFahrenheit");
        System.out.println("-------------------------------");
        System.out.println("\t\t");

        for (int k = 0; k <= 100; k++) {
            double i = k * 9 / 5.0 + 32;

            System.out.println("\t" + k + "\t\t\t\t" + (double)i);

        }
        System.out.println("-------------------------------");
            
        }
    }


