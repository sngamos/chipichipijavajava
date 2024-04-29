package week2;

public class ConstructorDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.3); // Which constructor(s) are invoked?
        Circle c2 = new Circle(10); // Which constructor(s) are invoked?
        Circle c3 = new Circle(100, "blue"); //Which constructor(s) are invoked?
        System.out.println("C1 Radius: " + c1.radius + ", color = " + c1.color); // C1 Radius: 1.0, color = Gray
        System.out.println("C2 Radius: " + c2.radius + ", color = " + c2.color); // C2 Radius: 10.0, color = Gray
        System.out.println("C3 Radius: " + c3.radius + ", color = " + c3.color); // C3 Radius: 100.0, color = blue
        System.out.println( "C1 Area: " + c1.getArea() ); // C1 Area: 3.141592653589793
        System.out.println( "C2 Area: " + c2.getArea() ); // C2 Area: 314.1592653589793
        System.out.println( "C3 Area: " + c3.getArea() ); // C3 Area: 31415.926535897932

//        Object y = new Circle();
//        Circle x = (Circle)y; // Downcasting
//        Circle z = (Circle) new Object(); //Result in error
    }
}
class Circle {
    // instance variables are declared here
    double radius;
    String color;
    Circle() { // Constructor
        this(1.0, "Gray"); // Invoking other constructor
        System.out.println("No-arg Constructor");
    }
    Circle(double radius) {
        this(radius, "Gray"); // Invoke the constructor below
    }
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    Circle(String color) {
        this.radius = 1.0;
        this.color = color;
    }

    double getArea() { // method
        return radius*radius*Math.PI;
    }
}