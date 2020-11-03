package kapitel4.opgave4_1;

import java.util.Scanner;

public class opgave4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Area of a pentagon");
        System.out.println("Enter the length from the center to a vertex");

         double r = input.nextDouble();

         double sidelength = ((2*r) * Math.sin(Math.PI/5));

         double area = (5*Math.pow(sidelength,2))/(4*Math.tan(Math.PI/5));


        System.out.println("The area of the pentagon is " + area);
    }
}
