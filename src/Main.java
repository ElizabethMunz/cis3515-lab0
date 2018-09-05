import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Liz's Shape Builder!");

        System.out.println("First, let's make a square.\nEnter a name for your square:");
        String sqName = in.nextLine();
        System.out.println("Enter the length of the square:");
        int square1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter the height of the square:");
        int square2 = Integer.parseInt(in.nextLine());
        Square mySquare = new Square(sqName);
        mySquare.setDimensions(square1, square2);

        System.out.println("-------------------------------------------------------");

        System.out.println("Now make a circle.\nEnter a name for your circle:");
        String cName = in.nextLine();
        System.out.println("Enter the radius of the circle:");
        int cRadius = Integer.parseInt(in.nextLine());
        Circle myCircle = new Circle(cName);
        myCircle.setDimensions(cRadius);

        System.out.println("-------------------------------------------------------");

        System.out.println("Now a triangle.\nEnter a name for your triangle:");
        String trName = in.nextLine();
        System.out.println("Enter the first side length:");
        int side1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter the second side length:");
        int side2 = Integer.parseInt(in.nextLine());
        System.out.println("Enter the third side length:");
        int side3 = Integer.parseInt(in.nextLine());
        //make sure it's a valid triangle
        while(side3 >= (side1 + side2) || side1 >= (side2 + side3) || side2 >= (side1 + side3)) {
            System.out.println("Uh oh! That's not a valid triangle. Let's try again.");
            System.out.println("Enter the first side length:");
            side1 = Integer.parseInt(in.nextLine());
            System.out.println("Enter the second side length:");
            side2 = Integer.parseInt(in.nextLine());
            System.out.println("Enter the third side length:");
            side3 = Integer.parseInt(in.nextLine());
        }

        Triangle myTriangle = new Triangle(trName);
        myTriangle.setDimensions(side1, side2, side3);

        System.out.println("-------------------------------------------------------");

        System.out.println("Now an equilateral triangle.\nEnter a name for your equilateral triangle:");
        String etName = in.nextLine();
        System.out.println("Enter the side length:");
        int etSide = Integer.parseInt(in.nextLine());
        EquilateralTriangle myEquilateralTriangle = new EquilateralTriangle(etName);
        myEquilateralTriangle.setDimensions(etSide);

        System.out.println("-------------------------------------------------------");

        //print everything
        mySquare.printDimensions();
        mySquare.printArea();

        myCircle.printDimensions();
        myCircle.printArea();

        myTriangle.printDimensions();
        myTriangle.printArea();

        myEquilateralTriangle.printDimensions();
        myEquilateralTriangle.printArea();

        in.close();
    }
}
