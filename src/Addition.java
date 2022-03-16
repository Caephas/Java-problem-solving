import java.util.Scanner;

public class Addition {
    //Additon program that take two inputs and displays the sum
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); //read first number from user

        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); //read second number from user

        sum = number1 + number2; //add numbers

        System.out.println("The sum is " + sum);
    }
}
