package String;

public class CountConsonants {
    public static void main(String[] args){
        String str = "Anushalav";
        int length = str.length();
        int count = 0;

        for(int i=0;i<=length-1;i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){

            }else{
                count++;
            }
        }
        System.out.println("Consonants = "+count);
    }
}
