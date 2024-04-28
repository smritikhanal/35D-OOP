import java.util.Scanner;

public class qno10 {
    public static void main(String[] args) {

        //10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. 
        // And use the following conditions to generate the final result;
        /* a. If equal to or more than 70 -> First Class
         * b. If more than 59 -> Upper Second Class
         * c. If more than 49 -> Second class
           d. If more than 39 -> Third class and if below than 40 the result is fail. 
           Hint: Use ternary operator
           */

    Scanner scan11 = new Scanner(System.in);
    System.out.println("Enter your marks of ENglish");
    int English = scan11.nextInt();
    System.out.println("Enter your marks of Nepali");
    int Nepali = scan11.nextInt();
    System.out.println("Enter your marks of Maths");
    int Maths = scan11.nextInt();
    System.out.println("Enter your marks of Science");
    int Science = scan11.nextInt();
    float total = (Maths+Science+Nepali+English);
    float percentage = (total/4);
    System.out.println("You have scored "+percentage+"%");
    if (percentage>=70){
        System.out.println("Your result: First Class");
    }
    else if (percentage>59){
        System.out.println("Your result: Upper Second Class ");
    }
    else if (percentage>49){
        System.out.println("Your result: Second class");
    }
    else if (percentage>39){
        System.out.println("Your result: Third class");
    }
    else{
        System.out.println("You have failed");
    }













    scan11.close();

    





    }
    
}
