import java.util.Scanner;
public class Arithmethic {
    public static  void main(String [] args){
        Scanner input = new Scanner(System.in);
//        an application that collects two
//        integers from the user and shows output
        int num1, num2, add_result,sub_result,mul_result,div_result;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        add_result = num1 + num2;
        sub_result = num1 - num2;
        mul_result = num1 * num2;
        div_result = num1 / num2;
        System.out.println("The addition is: " + add_result);
        System.out.println("The subtraction is: " + sub_result);
        System.out.println("The multiplication is: " + mul_result);
        System.out.println("The division is: " + div_result);

    }

}
