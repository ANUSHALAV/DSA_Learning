import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Number "+num+" to 1 : ");
        for(int i = num;i>=1;i--){
            System.out.print(i+",");
        }
    }
}
