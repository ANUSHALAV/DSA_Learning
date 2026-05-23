package Array;

public class SumOf2DArray {
   public static void main(String[] args){
       int[][] arr = {{1,2,3},{3,3,4},{6,7,8}};
       int sum =0;
       int colLength = arr[0].length;
       int rowLength= arr.length;

       for(int i =0;i<=rowLength-1;i++){
           for(int j=0;j<=colLength-1;j++){
               sum = sum+arr[i][j];
           }
       }

       System.out.print("Sum = "+sum);
   }

}
