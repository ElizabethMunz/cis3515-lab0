public class Circle extends Shape {

    private int radius;

    public Circle(String name) {
        super(name);
    }

    public void setDimensions(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void printDimensions() {
        System.out.println("CIRCLE DIMENSIONS\n Radius:" + radius);
    }
}
