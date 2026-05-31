package Basics;

public class PrimeNumber {
    public static void main(String[] args){
        int num = 12;

        for (int i =2;i<=num-1;i++){
            if(num%i==0){
                System.out.println("Numner is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
}
