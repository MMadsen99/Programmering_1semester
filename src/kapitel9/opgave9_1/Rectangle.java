package kapitel9.opgave9_1;

public class Rectangle {
    double width = 1;
    double height = 1;

    public static void main(String[] args) {

        // makes 2 new rectangles
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        // instead of rectangle2 having default width and height, I set them both to be 10 insted
        rectangle2.height = 10;
        rectangle2.width = 10;

        System.out.println("The rectangles area is " + rectangle1.getArea());
        System.out.println("The ractangles perimeter is " + rectangle1.getPerimeter());
        System.out.println("--------------------------------");
        System.out.println("The rectangles area is " + rectangle2.getArea());
        System.out.println("The ractangles perimeter is " + rectangle2.getPerimeter());
    }

    // constructor, makes a default width and height for all rectangles.
    Rectangle() {
     width = 2;
     height = 2;

    }
    // return the area (areal)
     double getArea() {

        return (width * height);
     }
     //retun the perimeter (omkreds)
     double getPerimeter() {

        return 2 * (width + height);
     }

}

