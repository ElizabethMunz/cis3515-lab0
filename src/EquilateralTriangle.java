public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(int side) {
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }

}
