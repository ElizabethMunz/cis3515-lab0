public class Triangle extends Shape {

    protected int side1, side2, side3;

    public Triangle(String name) {
        super(name);
    }


    public void setDimensions(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void printDimensions() {
        System.out.println("Dimensions of " + getName() + "\n   Side 1: " + side1 + "\n   Side 2: " + side2 + "\n   Side 3: " + side3);
    }

    public void printArea() {
        System.out.println("Area of "+ getName() + "\n   " + getArea());
    }
}
