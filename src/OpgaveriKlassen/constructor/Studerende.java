package OpgaveriKlassen.constructor;

public class Studerende {

    String navn;
    int alder;
    String by;
    String studieretning;
    String campus;

    public Studerende(String navn, int alder, String by) {
        this.navn = navn;
        this.alder = alder;
        this.by = by;
    }

    public Studerende() {
        System.out.println("Ny studerende er oprettet");
        studieretning = "Datamatiker";
        campus = "Næstved";
    }
}