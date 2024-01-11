package beginnerjava;

import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, addition, subtraction,multiplication, remainder;
        double division; 
        System.out.print("Enter First Number : ");
        num1=input.nextInt();
        System.out.print("Enter Second Number : ");
        num2=input.nextInt();
  
        addition = num1 + num2;
        subtraction = num1 - num2;
        multiplication = num1 * num2;
        division = (double)num1 / num2;
        remainder = num1 % num2;

        System.out.println("Sum : " + addition);
        System.out.println("Sub : " + subtraction);
        System.out.println("multiplication : " + multiplication);
        System.out.println("Div : " + division);
        System.out.println("Remainder : " + remainder);

    }
}
