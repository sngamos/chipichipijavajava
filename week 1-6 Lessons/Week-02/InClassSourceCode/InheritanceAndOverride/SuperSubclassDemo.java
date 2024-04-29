package week2.InheritanceAndOverride;

public class SuperSubclassDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        Circle c3 = new Circle(9.0, "Red");
        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());
        System.out.println(c3.getInfo());
    }
}
class GeometricObject {
    private String color;
    GeometricObject() {
        this("Green"); // Invoking other constructor
    }
    GeometricObject(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getInfo(){
        return "Geometric Object of color " + this.color;
    }
}

class Circle extends GeometricObject {
    private double radius;
    Circle() {
        this(1.0);
    }
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public String getInfo() {
        return "Circle with radius " + this.radius + " and color " + this.getColor();
    }
}