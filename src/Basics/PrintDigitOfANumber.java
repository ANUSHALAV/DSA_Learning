package Basics;

public class PrintDigitOfANumber {
    public static void main(String[] args){
        int num = 13534;

        while(num>0){
            int digit = num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
}
