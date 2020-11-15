package kapitel10.opgave10_4;

public class MyPoint {
    double x;
    double y;


    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint newPoint = new MyPoint(5,1);


        System.out.println("The distance between (" + (int)point1.x + "," + (int)point1.y + ") and (" + (int)newPoint.x + "," + (int)newPoint.y + ")");
        System.out.println("is " + distance(newPoint));
    }


    MyPoint(){
     this(0,0);

    }

    MyPoint(int x,int y){
        this.x = x;
        this.y = y;

    }
    public static double distance(MyPoint  newPoint){

        // d = distance between the two points

        double d = Math.sqrt((Math.pow(newPoint.getX() - newPoint.x,2) + Math.pow(newPoint.x - newPoint.getY(),2)));

        return d;

    }

    public double distance(double x, double y){

        return distance(new MyPoint((int)x,(int)y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
