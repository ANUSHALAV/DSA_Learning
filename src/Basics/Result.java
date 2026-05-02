import java.util.Scanner;

public class Result {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your subject marks :");
        System.out.print("Subject 1 : ");
        int sub1 = sc.nextInt();
        System.out.print("Subject 2 : ");
        int sub2 = sc.nextInt();
        System.out.print("Subject 3 : ");
        int sub3 = sc.nextInt();
        System.out.print("Subject 4 : ");
        int sub4 = sc.nextInt();
        System.out.print("Subject 5 : ");
        int sub5 = sc.nextInt();

        int total = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total : "+total+"/500");
        int avg = total/5;
        System.out.print("Percentage : "+avg+"%");
    }
}
