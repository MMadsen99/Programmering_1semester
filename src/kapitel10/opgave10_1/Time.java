package kapitel10.opgave10_1;



import java.util.Scanner;

public class Time {
    long hour;
    long minute;
    long second;



    //current time
    Time() {
        System.currentTimeMillis();
    }

    Time(long second, long minute, long hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;

        System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());
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

        long second = remaningSeconds2 - remaningSeconds3;


        System.out.println( "hour is " + hour % 24);
        System.out.println( "minute is " + minute);
        System.out.println( "secound is " + second);


    }

}


