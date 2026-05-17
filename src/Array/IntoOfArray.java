package Array;

public class IntoOfArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int ans = 1;
        int n = arr.length;
        for(int i= 0;i<=n-1;i++){
            ans = ans*arr[i];
        }
        System.out.print("Answere = "+ans);

    }
}
