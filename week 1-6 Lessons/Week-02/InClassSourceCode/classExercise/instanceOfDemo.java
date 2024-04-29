package week2.classExercise;

public class instanceOfDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        System.out.println( getInfo(c) );
        System.out.println( getInfo(s) );
    }

    public static String getInfo(GeometricObject g) {
        String s = "";
        // if it is a Circle object, return "Circle with radius of " + circle's radius
        if (g instanceof Circle) {
            s = "Circle with radius of " + ((Circle)g).getRadius(); // need to downcast to get the radius
        }
        // if it is a Square object, return "Square with a side length of " + square's side length
        else if (g instanceof Square) {
            s = "Square with a side of length of " + ((Square) g).getSide();
        }
        return s;
    }
}


class GeometricObject {
}

class Square extends GeometricObject {
    private double side = 5.0;
    public double getSide() {
        return side;
    }

}
class Circle extends GeometricObject {
    private double radius = 2.5;
    public double getRadius() {
        return radius;
    }
}