import java.util.Scanner;

public class qno5 {
    public static void main(String[] args) {

        // 5. Write a program to take two integer inputs from the user and print the sum and product of them.

        Scanner scan6 = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int f1 = scan6.nextInt();
        System.out.println("Enter second integer:");
        int f2 = scan6.nextInt();
        int sum = f1+f2;
        int product = f1*f2;
        System.out.println("Sum = "+sum);
        System.out.println("Product = "+product);
        scan6.close();

        
    }
    
}
