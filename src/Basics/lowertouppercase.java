import java.util.Scanner;

public class lowertouppercase {
    public static void main(String[]  args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter any lower case latter : ");
       String ch = sc.next();
       System.out.print("In Uppercase = "+ch.toUpperCase());
    }
}
