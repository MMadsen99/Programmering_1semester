package kapitel6;

import java.util.Scanner;

public class Opgave6_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(n);
        long j = n % 100;
        long k = j % 10;
        long l = k % 1;
        System.out.println(j);
        System.out.println(k);


    }

}
