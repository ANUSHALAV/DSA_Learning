package Array;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,11,23,23,43};
        int sum = 0;
        int n = arr.length;
        for(int i = 0;i<=n-1;i++){
            sum = sum+arr[i];
        }
        System.out.print("Sum = "+sum);
        sc.close();
    }
}
