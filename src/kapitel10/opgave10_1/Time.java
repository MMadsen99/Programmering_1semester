package kapitel10.opgave10_1;



import java.util.Scanner;

public class Time {
    long hour;
    long minute;
    long second;

    // Time since jan0 1 1970 in seconds = 1605260347

    public static void main(String[] args) {
        //  currentTime();

        /*
        Time time = new Time(1605260347);
        Time time1 = new Time(1000);
        Time time2 = new Time(40, 30, 90);
        */
        setTime(555550000); // time in milliseconds
    }

    Time() {
        long hour = 0;
        long minute = 0;
        long second = 0;
    }

    Time(long second) {

        long secondCurrently = second / 100;

        long minutsCurrently = secondCurrently / 60;

        long hourCurrently = minutsCurrently / 60;

        System.out.println(hourCurrently + ":" + minutsCurrently + ":" + second);
    }

    Time(long second, long minute, long hour) {


    }

    public long getHour() {
        return hour;
    }


    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public static void setTime(long elapseTime) {
       // Scanner input = new Scanner(System.in);

        long elapseTimeInSeconds = elapseTime / 1000;
            // 555.550 sekunder

        long hour = elapseTimeInSeconds / 3600;
        // 154 timer

        // find the reaming seconds by multiplying the even hours found above by 3,600.
        long remaningSeconds = (hour * 3600);

        // Then subtract that from the total seconds.
        long remaningSeconds2 = elapseTimeInSeconds - remaningSeconds;

        // Divide the remaining seconds by 60 to get the total number of remaining minutes.
        long minute = remaningSeconds2 / 60;

        //Find the remaining seconds again by multiplying the even minutes found above by 60. Then, subtract that from the total seconds. This is the remaining seconds.

        long remaningSeconds3 = minute * 60;

        long secound = remaningSeconds2 - remaningSeconds3;





        System.out.println( "hour is " + hour);
        System.out.println( "minute is " + minute);
        System.out.println( "secound is " + secound);




    }

}


