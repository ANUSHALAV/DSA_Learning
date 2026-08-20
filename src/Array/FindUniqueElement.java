package Array;

public class FindUniqueElement {
    public static void main(String[] args){
        int[] arr = {2,2,4,4,56,78,56,78,1};
        int length = arr.length;
        int uniqueNumber =0;

        for(int i =0; i<length;i++){
            uniqueNumber = uniqueNumber ^ arr[i];
        }
        System.out.print("Unique Number = "+uniqueNumber);
    }
}
