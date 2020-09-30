package kapitel5.Loops;

public class Whileloop {
    public static void main(String[] args) {
        int opvaskeMax = 12;
        int tallerknerIMaskinen = 0;

        while (tallerknerIMaskinen < opvaskeMax ) {
            String opvasketabs = "ja"; // Virker ikke fordi den er lavet i while loopet, så den kan kun bruges i loopet.
            System.out.println("Nu er der " + tallerknerIMaskinen + " tallerkner i maskinen.");
            tallerknerIMaskinen++;
            System.out.println(" Nu har jeg lagt endnu en tallerken i.");

        }
        System.out.println("");
        System.out.println("***********************************");
        System.out.println(" Der er nu " + tallerknerIMaskinen +  " tallerkner i maskinen");
    }

}
