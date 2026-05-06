package Method;

public class Overloading {
    public static void Display(int num){
        System.out.println("Method calling with integer value : "+num);
    }

    public static void Display(String name){
        System.out.println("Method calling with String value is  : "+name);
    }
    public static void main(String[] args){

        Display(2);
        Display("Anushalav Bhatt");
    }
}
