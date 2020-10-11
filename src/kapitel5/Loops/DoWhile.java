package kapitel5.Loops;

public class DoWhile {
// do while loop kører ALTID 1 gang
    public static void main(String[] args) {
        int opvaskeMax = 12;
        int tallerknerIMaskinen = 0;

        do {
            System.out.println("Der er " + tallerknerIMaskinen + " tallerkner i maskinen.");
            tallerknerIMaskinen++;
            System.out.println(" Nu har jeg lagt endnu en tallerken i.");
        }while (tallerknerIMaskinen < opvaskeMax );
        System.out.println(" Der er nu " + tallerknerIMaskinen +  " tallerkner i maskinen");
    }
}
