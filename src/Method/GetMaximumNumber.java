package Method;
import java.util.Scanner;
public class GetMaximumNumber {
    public static int FindMaximumNumber(int num1,int num2){
        if(num1>num2){
            return num1;
        }
        return num2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Maximumm Number is : "+FindMaximumNumber(num1,num2));
        sc.close();
    }
}
