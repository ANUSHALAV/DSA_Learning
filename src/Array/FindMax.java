package Array;

public class FindMax {
    public static void main(String[] args){
        int[] arr= {2,45,67,457,33,345,55};

        int max = arr[0];
        int n = arr.length;
        for(int i = 1;i<=n-1;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.print("Max value is = "+max);
    }
}
