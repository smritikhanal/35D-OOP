import java.util.Scanner;
 
public class scqno4 {
    public static void main(String[] args) {
        // 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.println("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        double area;
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + area);
                break;
            case 2:
                System.out.println("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.println("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.println("Area of the rectangle: " + area);
                break;
            case 3:
                System.out.println("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.println("Area of the square: " + area);
                break;
            case 4:
                System.out.println("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of the triangle: " + area);
                break;
            default:
                System.out.println("Invalid choice entered.");
                return;
                scanner.close();
        }
    }
}


