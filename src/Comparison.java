import java.util.Scanner;
public class Comparison {
    public static void main(String[]args){
//        get two integers and display the equivalent
//        conditional statements
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("Number 1 is larger");
        }else if(num1 == num2){
            System.out.println("The two numbers are equal");
        }else {
            System.out.println("Number 2 is greater than number 1 ");
        }
    }
}
