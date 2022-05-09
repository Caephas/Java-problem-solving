//(Diameter, Circumference and Area of a Circle) Here’s a peek ahead. In this chapter, you
//        learned about integers and the type int. Java can also represent floating-point numbers that contain
//        decimal points, such as 3.14159. Write an application that inputs from the user the radius of a circle
//        as an integer and prints the circle’s diameter, circumference and area using the floating-point value
//        3.14159 for π.
import java.util.Scanner;
import  java.lang.* ;
public class CircleProblem {
    public static void main(String [] args){

        final double PI = 3.141592653;

        Scanner in = new Scanner(System.in);

        /* Input radius of circle from user. */
        System.out.println("Please enter radius of the circle : ");
        int r = in.nextInt();

        /* Calculate diameter, circumference and area. */
        int d = 2 * r;
        double circumference = 2 * PI * r;
        double area = PI * r * r;


        /* Print diameter, circumference and area of circle. */
        System.out.println("Diameter of circle is : " + d);
        System.out.println("Circumference of circle is : " + circumference);
        System.out.println("Area of circle is : " + area);

        
    }
}
