import java.util.Scanner;

public class qno9 {
    public static void main(String[] args) {

    // 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

    Scanner scan10 = new Scanner(System.in);
    
        System.out.println("Enter the length of the rectangle: ");
        double length = scan10.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = scan10.nextDouble();
        
 
        double area = length * breadth;
        int areaInt = (int)area;
        System.out.println("Area of the rectangle: " + areaInt);







    scan10.close();

        
    }
    
}
