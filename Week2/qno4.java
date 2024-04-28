import java.util.Scanner;

public class qno4 {
    public static void main(String[] args) {
        // 4. Write the ternary operator for question no. 1
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan5.nextInt();
        if (a>18){
            System.out.println("You are eligible for voting.");
        }
        else{
            System.out.println("You are not eligible for voting.");
        }
        scan5.close();
        
    }

    
}

