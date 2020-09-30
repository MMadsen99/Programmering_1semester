package Kapitel2;

import java.util.Scanner;

public class ScannerOpgaver{
    public static void main(String[] args) {

        System.out.println("Skriv hvad din radius er");

        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();

        double areal = radius * radius * Math.PI; // Math.PI = 3.14159 osv..

        System.out.println("arealet af din cirkel er " + areal);
    }

    public static class MilesConverter {
        public static void main(String[] args) {

            System.out.println("Enter Miles");

            Scanner input = new Scanner(System.in);

            double miles = input.nextDouble();

            double kilometers = miles * 1.6;

            System.out.println(miles + " Miles is " + kilometers + " kilometers" );
        }

    }
}
class VolumeOfTriangle {

    public static void main(String[] args) {

        //volume udregner (rumfang udregner)

        System.out.println("skriv sidelængden på din ligesidet trekant");

        Scanner input = new Scanner(System.in);

        double Length = input.nextDouble();

        double area = Length * Length * Length / 2;

        double volume = area * Length;

        System.out.println("Trekantens volume er = " + volume);



    }
}
class MetersToFeet{

    public static void main(String[] args) {
        // Meter to feet converter
        System.out.println("Enter a value for meter");

        Scanner input = new Scanner(System.in);

        double meter = input.nextDouble();

        double feet = meter * 3.2786;

        System.out.println(meter + " Meter is " + feet + " feet");

    }

}
class squaremetertoping {
    public static void main(String[] args) {

        System.out.println("Enter a number in square meters");

        Scanner input = new Scanner(System.in);

        double squareMeter = input.nextDouble();

        double ping = squareMeter * 0.03025;

        System.out.println(squareMeter + " square meters is " + ping + " pings");
    }
}
class CalculateTips{
    public static void main(String[] args) {
        // beregne drikkepenge
        System.out.println("Enter the subtotal and a gratuity rate");

        Scanner input = new Scanner(System.in);

        double subtotal = input.nextDouble();
        double gratuityrate = input.nextDouble();

        // så skal vi udregne total og drikkepenge
        double drikkepenge = subtotal * (gratuityrate/100);
        double total = drikkepenge + subtotal;

        System.out.println(" mængden af drikkepenge er $" + drikkepenge + ", ialt bliver det $" + total);
    }
}
