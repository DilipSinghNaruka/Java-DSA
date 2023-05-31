import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = input.nextDouble();

        boolean isIsosceles = (side1 == side2) || (side1 == side3) || (side2 == side3);

        if (isIsosceles) {
            System.out.println("The triangle is an isosceles triangle.");
        } else {
            System.out.println("The triangle is not an isosceles triangle.");
        }
    }
}
