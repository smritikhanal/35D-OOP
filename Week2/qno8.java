import java.util.Scanner;

public class qno8 {
    public static void main(String[] args) {

    // 8. Take side of a square from user and print area and perimeter of it. 
    //Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

    Scanner scan9 = new Scanner(System.in);
    System.out.println("Enter side:");
    float s = scan9.nextFloat();
    float A = (s*s);
    System.out.println("Area of square ="+ A);
    float P = (4*s);
    System.out.println("Perimeter ="+P);
    System.out.println("Enter Principle:");
    float PrincipleAmount = scan9.nextFloat();
    System.out.println("Enter Time:");
    float Time = scan9.nextFloat();
    System.out.println("Enter Rate:");
    float Rate = scan9.nextFloat();
    float SI = (PrincipleAmount*Time*Rate/100);
    System.out.println("Simple Interest is Rs. "+ SI);
    System.out.println("Enter base:");
    float base = scan9.nextFloat();
    System.out.println(("Enter height:"));
    float height = scan9.nextFloat();
    float A1 = (base*height/2);
    System.out.println("Area of triangle =" + A1);
    System.out.println("Enter length:");
    float l = scan9.nextFloat();
    float V = (l*l*l);
    System.out.println("Volume of cube ="+ V);
    System.out.println("Enter lenth");
    float l1 = scan9.nextFloat();
    System.out.println("Enter breadth");
    float b = scan9.nextFloat();
    System.out.println("Enter height");
    float h = scan9.nextFloat();
    float V1 = (l1*b*h);
    System.out.println("Volume of cuboid ="+ V1);
    
scan9.close();




        
    }
}
