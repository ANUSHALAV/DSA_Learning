import java.util.Scanner;

public class print1toN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.print("Number 1 to "+num+" = ");
        for(int i=1;i<=num;i++){
            System.out.print(i+",");
        }
    }
}
