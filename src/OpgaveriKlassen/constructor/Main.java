package OpgaveriKlassen.constructor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Studerende st1 = new Studerende("Mathias", 20, "Næstved");

        Studerende st2 = new Studerende();
        st2.navn = "Erik";
        st2.alder = 22;
        st2.by = "Næstved";

        Studerende st3 = new Studerende("Bo", 25, "Næstved");


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hvilken studerende ville du slå op?");
        String elev = scanner.nextLine();

        switch (elev) {
            case "Mathias":
                System.out.println("elevens alder er " + st1.alder);
                break;
            case "Erik":
                System.out.println("elevens alder er " + st2.alder);
                break;
            case "Bo":
                System.out.println("elevens alder er " + st3.alder);

            default:
                System.out.println("ikke en studerende");
        }
    }
}
