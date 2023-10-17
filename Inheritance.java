import java.io.*;

class Shape {
    String str1 = "The area is ";

    public void area() {
        System.out.println("Gives the area of the shape");
    }
}

class Triangle extends Shape {

    public void area(int l, int h) {
        System.out.println(str1 + (l * h) / 2);
    }
}

class Square extends Shape {
    public void area(int s) {
        System.out.println(str1 + s * s);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(2, 2);
        Square sq1 = new Square();
        sq1.area(5);
    }
}