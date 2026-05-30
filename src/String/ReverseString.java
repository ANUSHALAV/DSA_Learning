package String;

public class ReverseString {
    public static void main(String[] args){
        String str = "Anushalav";
        String reverseStr = "";
        int length = str.length();

        for(int i=length-1;i>=0;i--){
            char ch = str.charAt(i);
            reverseStr = reverseStr + ch;
        }

        System.out.print(reverseStr);
    }
}
