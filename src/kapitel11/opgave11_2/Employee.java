package kapitel11.opgave11_2;



import java.util.Date;

public class Employee  extends Person{


    int salary = 30000;
    boolean office = true;
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println( Person.getName() + " got hired: "+ date.toString());

    }

}
