import java.util.Scanner;

public class qno7 {
    public static void main(String[] args) {

        // 7. Take the name, roll number, and field of interest from the user and print in the format below: 
        // Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.

        Scanner scan8 = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan8.nextLine();
        System.out.println("Enter your roll number:");
        int roll = scan8.nextInt();
        System.out.println("Enter your field of interest:");
        String field = scan8.next();
        System.out.print("Hey, my name is "+name+" and my roll number is "+roll+". ");
        System.out.print("My field of interest are "+field+".");
        scan8.close();


        












    
        
    }
    
}
