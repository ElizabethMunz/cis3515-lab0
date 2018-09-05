public class Square extends Shape {

    private int length, height;

    public Square(String name) {
        super(name);
    }

    public void setDimensions(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void printDimensions() {
        System.out.println("Dimensions of " + getName() + "\n   Length: " + length + "\n   Height: " + height);
    }

    public void printArea() {
        System.out.println("Area of "+ getName() + "\n   " + getArea());
    }
}
