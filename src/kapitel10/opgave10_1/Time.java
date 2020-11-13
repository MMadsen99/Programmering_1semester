package kapitel10.opgave10_1;



import java.util.Scanner;

public class Time {
    long hour = 0;
    long minute = 0;
    long second = 0;

     // Time since jan0 1 1970 in seconds = 1605260347

    public static void main(String[] args) {
        currentTime();



    }

    Time() {
        long hour = 0;
        long minute = 0;
        long second = 0;
    }
public static void currentTime(){
        Scanner input = new Scanner(System.in);

    System.out.println("Enter the current time in seconds: ");

        long secondCurrently = input.nextLong();

        long MinutsCurrently = secondCurrently / 60;

        long hourCurrently = MinutsCurrently / 60;

        long dayCurrently = hourCurrently / 24;

    System.out.println(dayCurrently + ":" + hourCurrently + ":" + MinutsCurrently + ":" + secondCurrently);

}



}