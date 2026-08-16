package Basics;
import java.util.Scanner;

public class EvenOddWithOutModuls {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        if((num&1)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
        sc.close();
    }
}