import java.util.Scanner;

public class MultipleDetermination {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        if(num1 % num2 == 0){
            System.out.println("Number 1 is a multiple of number 2");
        }else {
            System.out.println("Number 1 is NOT a multiple of number 2");
        }

    }
}
