package Basics;

import java.util.Scanner;
public class SwapTwoNumberWithXOR
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number = ");
        int num2 = sc.nextInt();

        System.out.println("\nBefore Swaping \nA = "+num1+"\nB = "+num2);

        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("\nAfter Swaping \nA = "+num1+"\nB = "+num2);
        sc.close();
    }
}
