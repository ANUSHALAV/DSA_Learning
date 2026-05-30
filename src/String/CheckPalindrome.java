package String;

public class CheckPalindrome {
    public static void main(String[] args){
        String str = "noon";
        int length = str.length();
        String newStr = "";

        for(int i=length-1;i>=0;i--){
            char ch = str.charAt(i);
            newStr = newStr+ch;
        }
        if(str.equalsIgnoreCase(newStr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
