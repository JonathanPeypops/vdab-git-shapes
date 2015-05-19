package be.vdab.shapes;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
        double h = 8;
        double b = 4;
        perimeter = ((h*b)/2);
    }
}
