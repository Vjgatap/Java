package Java.OOPs;

import java.lang.*;

class Rectangle {
    public double length;
    public double breadth;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    boolean isSquare() {
        if (length == breadth)
            return true;
        else
            return false;
    }

}

public class Program1 {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.breadth = 5;

        System.out.println("Area of Rectangle is: " + r1.area());
        System.out.println("Perimeter of the rectangle is " + r1.perimeter());
        System.out.println("its is a square : " + r1.isSquare());

    }
}
