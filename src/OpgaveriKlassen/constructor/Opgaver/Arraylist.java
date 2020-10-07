package OpgaveriKlassen.constructor.Opgaver;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> sheeps = new ArrayList();
        double x = 1.0D;
        System.out.println((int)x);
        sheeps.add("Karen");
        sheeps.add("Bo");
        sheeps.add("Jimmy");
        System.out.println(sheeps);
        System.out.println("Det første får hedder " + (String)sheeps.get(0));
        System.out.println("Det første får hedder " + (String)sheeps.get(1));
        System.out.println("Det første får hedder " + (String)sheeps.get(2));
        sheeps.set(1, "Bente");
        System.out.println("Bo skifter navn til " + (String)sheeps.get(1));
        System.out.printf("Der er %d får i flokken", sheeps.size());
    }
}
