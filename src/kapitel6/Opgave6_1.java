package kapitel6;

public class Opgave6_1 {
    public static void main(String[] args) {
        // write the PentagonalNumber 100 times
        for (int i = 0; i < 101; i++) {

            System.out.printf("%7d\n", GetPentagonalNumber(1 + i)); //GetPentagonalNumber calls the method belows

        }


    }

public static int GetPentagonalNumber(int n) {

    int result = (n * (3 * n - 1)) / 2;

    return result;
}
}


