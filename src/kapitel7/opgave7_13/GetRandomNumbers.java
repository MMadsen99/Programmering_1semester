package kapitel7.opgave7_13;
import java.util.Random;

public class GetRandomNumbers {
     static int randomNumber;
    Random rand = new Random();
    static int[] Tal = {1,13 ,34, 12, 35, 9, 23, 12 ,91 ,10 ,42 ,65, 14,91 ,67};
    public static void main(String[] args) {

        System.out.println(getRandom(Tal));

    }

public  static int getRandom(int[] Tal) {
    Random rand = new Random();
    randomNumber = Tal[rand.nextInt(14)];

    return randomNumber;

    }


}