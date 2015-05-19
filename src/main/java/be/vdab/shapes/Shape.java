package be.vdab.shapes;

public abstract class Shape {
    protected String name;
    double perimeter;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public double perimeter(){
		return perimeter;
    }

    @Override
    public String toString() {
        return "Shape '" + name + "' " + perimeter;
    }  
}