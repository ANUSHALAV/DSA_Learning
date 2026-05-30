package String;

public class CountVowels {
    public static void main(String[] args){
        String str = "Anushalav";
        String newStr = str.toLowerCase();
        int length = newStr.length();
        int count = 0;

        for(int i = 0;i<=length-1;i++){
            char ch = newStr.charAt(i);
            if(ch == 'a'||ch=='e'||ch == 'i'||ch == 'o'||ch =='u'){
              count++;
            }
        }

        System.out.print("Count Vowels = "+count);
    }
}
