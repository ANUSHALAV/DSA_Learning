package Basics;

public class PalindromeNumber {
    public static void main(String[] args){
        int num = 12210;
        int temp = num;
        int reverseNum = 0;

        while(temp!=0){
           int digit = temp%10;
           reverseNum = reverseNum*10+digit;
           temp = temp/10;
        }

        if(num==reverseNum){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
