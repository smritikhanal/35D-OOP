import java.util.Scanner;

public class qno6 {
    public static void main(String[] args) {

        // 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
        // Finally, calculate the division of the thus obtained sum and product and print the result.

        Scanner scan7 = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int aa = scan7.nextInt();
        System.out.println("Enter second integer:");
        int bb = scan7.nextInt();
        int sum1 = aa+bb;
        int product1 = aa*bb;
        System.out.println("Sum = "+sum1);
        System.out.println("Product = "+product1);
        float division = (sum1 + product1 / 2);
        System.out.println("The result is  = "+division);
        scan7.close();
        
    }
    
}

