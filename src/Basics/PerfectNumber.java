package Basics;

public class PerfectNumber {
    public static void main(String[] args){
        int num = 6;
        int ans = 1;

        for(int i =2;i<num;i++){
            if(num%i==0){
                ans = ans+i;
            }
        }

        if(ans==num){
            System.out.println("Number is perfect");
        }else{
            System.out.println("Number is not perfect");
        }
    }
}
