package kapitel5.OpgaverIKapitel5;

public class Opgave5_5 {

        public static void main(String[] args) {
            //overskriften
            int j = 20;

            System.out.println("Celsius \t\t\tFahrenheit | \tFahrenheit\t\tCelsius  ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("\t\t");

            for (int k = 0; k <= 100; k++) {

                double h = (j + - 32) / 1.8;
                double i = k * 9 / 5.0 + 32;
                j++;
                System.out.println("\t" + k + "\t\t\t\t" + i + " | \t\t\t " + (j + (9 - 10)) + "\t\t\t\t" + h);


                }

            System.out.println("-------------------------------");
        }
        }
