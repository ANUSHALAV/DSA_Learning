package String;

public class CountWordsInSentance {
    public static void main(String[] args){
        String str = "My name is Anushalav Bhatt";
        String[] newStr = str.split(" ");
        int length = newStr.length;

        System.out.println("Words in sentance : "+length);
    }
}
