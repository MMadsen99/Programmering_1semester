package Kapitel1;

class Displaymessages {
    public static void main(String[] args) {
        // Kapitel3.opgave 1.1  (display 3 messages)
        System.out.println("1.1");
        System.out.println("Welcome to java");
        System.out.println("Learning java now");
        System.out.println("Programming is fun");

        // Kapitel3.opgave 1.2  (display 5 messages)
        System.out.println(1.2);
        int i = 0;
        while (i <= 4) {
            System.out.println("I love java");
            i++;
        }
        // Kapitel3.opgave 1.4  (print a table)
        System.out.println("1.4");
        System.out.println("a   a^2  a^3  a^4");
        System.out.println("1   1    1    1");
        System.out.println("2   4    8    16");
        System.out.println("3   9    27   81");
        System.out.println("4   16   64  256");

        // Kapitel3.opgave 1.5
        System.out.println(1.5);
        System.out.print("(7.5 * 6.5 - 4.5 * 3)/(47.5 - 5.5 ) = ");
        System.out.println((7.5 * 6.5 - 4.5 * 3)/(47.5 - 5.5));

        // Kapitel3.opgave 1.6
        System.out.println("1.6");
        System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = ");
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

        //Kapitel3.opgave 1.12
        System.out.println("1.12");
        // vi skal omskrive miles til kilometer
        System.out.println("Miles to kilometers is " + (24 * 1.6));
        // vi skal omskrive 1 time 40 min og 35 sek til sekunder
        System.out.println("Number of hour in fraction is " + ((60 * 60) + (40 * 60) + 35)/ (60.0 * 60));

        System.out.println("he ran " + (38.400000000000006 / 1.676388888888889 ) + " kilometers per hour");

    }

}