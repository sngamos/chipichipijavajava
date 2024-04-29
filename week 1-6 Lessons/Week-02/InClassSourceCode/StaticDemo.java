package week2;

public class StaticDemo {
    public static void main(String[] args) {
        Circle2 circle1 = new Circle2(1.0);
        Circle2 circle2 = new Circle2(10.0);
        System.out.println(circle1.radius);
        System.out.println(circle2.radius);

        // Access static attribute or method directly from the class
        // Also accessible from object but not recommended for readability reason
        System.out.println(Circle2.getNumberOfObjects());

        Circle2 circle3 = new Circle2();
        Circle2 circle4 = new Circle2();
        Circle2 circle5 = new Circle2(10.0);
        System.out.println(Circle2.getNumberOfObjects());
    }
}
class Circle2 {
    double radius;
    private static int numberOfObjects; // this attribute belongs to Circle2

    Circle2() {
        this(1.0);
    }
    Circle2(double radius) { // Constructor
        this.radius = radius; // Assign attribute
        numberOfObjects += 1; // increment class attribute
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        System.out.println( Circle2.getNumberOfObjects() );
        return radius * radius * Math.PI;
    }
}