package Afleveringer;

import java.util.Scanner;

public class MomsRegning {

    public static void main(String[] args) {
        plusDanskmoms();
        plusTyskMoms();
    }

    public static void plusDanskmoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("skriv salgsmængde: ");

        double salgsmængde = input.nextDouble();
        double moms = salgsmængde * 0.25;
        System.out.println("Den danske moms er " + (int) (moms * 100) / 100.0);
    }

    public static void plusTyskMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("skriv salgsmængde: ");

        double salgsmængde = input.nextDouble();
        double moms = salgsmængde * 0.16;

        System.out.println("Den tyske moms er " + (int) (moms * 100) / 100.0);

    }
}