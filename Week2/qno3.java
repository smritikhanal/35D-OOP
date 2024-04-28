import java.util.Scanner;

public class qno3 {
    public static void main(String[] args) {

        // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        // Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter base:");
        float base = scan2.nextFloat();
        System.out.println(("Enter height:"));
        float height = scan2.nextFloat();
        float A = (base*height/2);
        System.out.println("Area of triangle =" + A);
        

        System.out.println("Enter length:");
        float l = scan2.nextFloat();
        float V = (l*l*l);
        System.out.println("Volume of cube ="+ V);
       

        
        System.out.println("Enter lenth");
        float l1 = scan2.nextFloat();
        System.out.println("Enter breadth");
        float b = scan2.nextFloat();
        System.out.println("Enter height");
        float h = scan2.nextFloat();
        float V1 = (l1*b*h);
        System.out.println("Volume of cuboid ="+ V1);
     

        scan2.close();
        
    }
    
}


