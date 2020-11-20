package kapitel11.opgave11_4;

import java.util.ArrayList;
import java.util.Collections;

public class opgave11_4 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(13);
        number.add(10);
        number.add(23);
        number.add(9);
        System.out.println(number.toString());
        max(number);
        System.out.println(number.get(0));
    }


    public static ArrayList<Integer> max(ArrayList<Integer> number){

        for (int i = 0; i < number.size(); i++) {
            if (number.get(0) < number.get(i)){
                Collections.swap(number,0,i);

            }
        }

        return number;
    }
}
