package kapitel6.Opgave6_2;

public class Opgave6_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {

            System.out.printf("%7d\n", GetPentagonalNumber(1 + i));

        }


    }

public static int GetPentagonalNumber(int n) {

    int result = (n * (3 * n - 1)) / 2;

    return result;
}
}


