package kapitel11.opgave11_2;

public  class Student extends Person {

      final private static String  CLASSSTATUS = "senior";
    

     
     public static void main(String[] args) {
          System.out.println(Person.getName() + " is a " + Student.CLASSSTATUS );
     }


}
