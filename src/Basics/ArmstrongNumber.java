package Basics;

public class ArmstrongNumber {
    public static void main(String[] args){
        int num = 153;
        int temp=num;
        int ans = 0;

        while(temp!=0){
            int digit = temp%10;
            ans = ans+(digit*digit*digit);
            temp = temp/10;
        }

        if(num==ans){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is Not Armstrong");
        }
    }
}
