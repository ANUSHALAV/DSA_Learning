import java.util.Scanner;

public class uppercasetolowercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Uppercase Latter : ");
        String ch = sc.next();
        System.out.print("In Lower Case : "+ch.toLowerCase());
    }
}
