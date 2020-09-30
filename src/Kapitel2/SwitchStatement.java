package Kapitel2;

public class SwitchStatement {
    public static void main(String[] args) {
        int biler = 3;
        switch (biler) {
            case 1:
                System.out.println("Der er 1 bil");
                break;
            case 2:
                System.out.println("Der er 2 biler");
                break;
            default:
                System.out.println("Der er 3 eller flere biler");
        }
    }

}