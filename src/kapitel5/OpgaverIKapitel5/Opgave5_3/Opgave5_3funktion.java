package kapitel5.OpgaverIKapitel5.Opgave5_3;

import java.util.MissingFormatArgumentException;
import java.util.IllegalFormatConversionException;

public class Opgave5_3funktion {
    public static void funktion() {

        final double CelInFahr = (9/5) + 32; // constant created ( 1 fahrenheit er altid  celsius * 9/5 + 32)

        System.out.println(" Celsius            Fahrenheit"); // header for the table

        for (int i = 0; i < 10; i++) {
            System.out.printf( "%4d", i * (9/5) + 32 );
            for (int k = 0; k < 2; k++) {
                System.out.println("         " + i);
            }
        }



    }



    }

