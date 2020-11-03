package kapitel4.opgave4_4;

import java.util.Scanner;

public class opgave4_4 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


        System.out.println("Area of a hexagon");
        System.out.println("-------------------");
        System.out.println("Enter the side length: ");

        double sideLength = input.nextDouble();

        double area = (6* Math.pow(sideLength,2)/ (4 * Math.tan(Math.PI/6)));

        System.out.println("The area of the hexagon is " + area);

    }

}
