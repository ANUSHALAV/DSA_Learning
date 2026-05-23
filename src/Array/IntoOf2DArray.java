package Array;

public class IntoOf2DArray {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
        int ans = 1;

        for(int i =0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                ans = ans* arr[i][j];
            }
        }
        System.out.print("Ans = "+ans);
    }
}
