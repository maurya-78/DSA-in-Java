package MultiDimensionalArrays;

public class ColumnWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        int maxSum = Integer.MIN_VALUE;

        for (int j = 0; j < arr[0].length; j++) {
            int column = 0;
            int sum =0;
            while(column<arr.length){
                sum+=arr[column][j];
                column++;
            }

            maxSum=Math.max(sum,maxSum);
        }

        System.out.println(maxSum);
    }
}
