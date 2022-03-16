import java.util.Scanner;
public class SmallestLargest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,num4, num5;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();
        System.out.print("Enter the fourth number: ");
        num4 = input.nextInt();
        System.out.print("Enter the fifth number: ");
        num5 = input.nextInt();


        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 is larger");
        }else if(num1 > num4 && num1 > num5){
            System.out.println("Number 1 is greater");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Number 2 is larger");
        }else if(num2 > num4 && num2 > num5){
            System.out.println("Number 2 is greater");
        }else if (num3 > num1 && num3 > num2){
            System.out.println("Number 3 is larger");
        }else if (num4 > num5 && num4 > num1){
            System.out.println("Number 4 is greater");
        }else if(num4 > num2 && num4 > num3){
            System.out.println("Number 4 is greater");
        }else if(num5 > num1 && num5 > num2){
            System.out.println("Number 5 is greater");
        }else if (num5 > num3 && num5 > num4){
            System.out.println("Number 5 is greater");
        }
    }

}
