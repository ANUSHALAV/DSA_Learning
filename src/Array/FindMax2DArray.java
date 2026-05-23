package Array;

public class FindMax2DArray {
    public static void main(String[] args){
        int[][] arr= {{1,2,3},{4,59,6},{7,8,7}};
        int maxValue = arr[0][0];

        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;j++){
                if(arr[i][j]>maxValue){
                    maxValue = arr[i][j];
                }
            }
        }

        System.out.print("Max value = "+maxValue);
    }
}
