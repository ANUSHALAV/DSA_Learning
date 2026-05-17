package Array;

public class FindMin {
    public static void main(String[] args){
        int[] arr = {2,4,56,54,5,34,1,-3,4,45};
        int min = arr[0];
        int n = arr.length;

        for(int i = 1;i<=n-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("Min value is = "+min);
    }
}
