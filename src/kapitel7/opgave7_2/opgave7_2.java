package kapitel7.opgave7_2;
import java.util.Arrays;
import java.util.Scanner;


public class opgave7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] mylist = new int[11];

        System.out.println("Enter 11 integers: ");

        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = input.nextInt();
        }
        compareLastInt(mylist);
    }

    public static void compareLastInt(int[] mylist){



        for (int i = 0; i < 10; i++) {

            int diffrence = mylist[10] - mylist[i];

            if (diffrence == 0) {
                System.out.println("The integer is equal to the 11th integer");
            }else if (diffrence > 0){
                System.out.println("The integer is smaller than the 11th integer");
            }else if (diffrence < 0){
                System.out.println("The integer is greater then the 11th integer");
            }
            //souten under viser hvad forskellen er mellem de 2 indekser
            //System.out.println("The diffrence between " + mylist[10] + " and " + mylist[i] + " is " + diffrence);
        }

    }

}
