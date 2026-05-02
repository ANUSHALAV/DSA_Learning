import java.util.Scanner;

public class vote
{
    public static void main(String[] args){
        System.out.print("Enter Your Age : ");
        int age = new Scanner(System.in).nextInt();

        if(age>=18){
            System.out.println("You Are Eligible for Vote.");
        }else{
            System.out.println("You Are not Eligible for Vote.");
        }
    }
}
