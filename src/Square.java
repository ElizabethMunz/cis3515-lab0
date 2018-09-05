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
        double area = length * height;
        return area;
    }

    @Override
    public void printDimensions() {
        System.out.println("Length: " + length + " Height: " + height);
    }
}
