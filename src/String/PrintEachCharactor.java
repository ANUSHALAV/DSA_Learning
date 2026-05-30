package String;

public class PrintEachCharactor {
    public static void main(String[] args){
        String str = "Anushalav";
        int lengthOfString = str.length();

        for(int i=0;i<=lengthOfString-1;i++){
            System.out.println(str.charAt(i));
        }
    }
}