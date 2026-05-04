package Method;
import java.util.Scanner;

public class CheckEvenOrNotByMethod {
    public static boolean isEvenOrNot(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        boolean isEven = isEvenOrNot(num);
        if(isEven){
            System.out.print("Number is Even");
        }else{
            System.out.print("Number is Odd");
        }
        sc.close();
    }
}
