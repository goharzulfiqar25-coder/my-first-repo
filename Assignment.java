// Base class Zulfiqar Gauhar Sap id 76579
class Shape {

    public void draw() {
        System.out.println("Drawing a shape...");
    }

    public double calculateArea() {
        return 0;
    }
}
// Circle subclass  Zulfiqar Gauhar Sap id 76579
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
    }

    @Override  //Zulfiqar Gauhar Sap id 76579
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
// Cylinder subclass Zulfiqar Gauhar Sap id 76579
class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Cylinder...");
    }

    // Zulfiqar Gauhar Sap id 76579
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}
public class Assignment {
     public static void main(String[] args) {

        // Circle object Zulfiqar Gauhar Sap id 76579
        Circle c = new Circle(5);
        c.draw();
        System.out.println("Circle Area: " + c.calculateArea());

        System.out.println();

        // Cylinder object Zulfiqar Gauhar Sap id 76579
        Cylinder cy = new Cylinder(3, 7);
        cy.draw();
        System.out.println("Cylinder Surface Area: " + cy.calculateArea());
    }
}
