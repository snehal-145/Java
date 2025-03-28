import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    // Method to set dimensions
    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    double getArea() {
        return length * breadth;
    }
}

public class AreaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of the Area class
        Area rectangle = new Area();

        // Taking user input
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        // Setting dimensions and calculating area
        rectangle.setDim(length, breadth);
        double area = rectangle.getArea();

        // Displaying the area
        System.out.println("The area of the rectangle is: " + area);

        sc.close();
    }
}
