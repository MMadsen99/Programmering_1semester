package kapitel10.opgave10_4;

public class MyPoint {
    int x;
    int y;


    public static void main(String[] args) {
        MyPoint mp = new MyPoint(5,1);
      distance(mp);
       MyPoint mp1 = new MyPoint();
    }


    MyPoint(){
        x = 0;
        y = 0;
        System.out.println("The point is " + "(" + x + "." + y + ")");

    }

    MyPoint(int x,int y){
        System.out.println("The point is " + "(" + x + "." + y + ")");

    }
    public static void distance(MyPoint  mp1){


    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
