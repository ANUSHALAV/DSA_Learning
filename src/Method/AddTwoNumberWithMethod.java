package Method;
import java.util.Scanner;

public class AddTwoNumberWithMethod {
    public static int AddTwoNumber(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 =sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Sum : "+AddTwoNumber(num1,num2));
        sc.close();
    }
}
