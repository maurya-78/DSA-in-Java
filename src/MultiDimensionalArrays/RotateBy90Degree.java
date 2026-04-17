package MultiDimensionalArrays;
import java.util.ArrayList;
import java.util.List;

public class RotateBy90Degree {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        // transpose
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse
        for(int i=0;i<arr.length;i++){
            int stCol = 0, endCol = arr[0].length-1;
            while(stCol<= endCol){
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                stCol++;
                endCol--;
            }
        }
        //Print
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public List<List<Integer>> generate(int n) {
           List<List<Integer>> ans = new ArrayList<>();
           for(int i=0;i<n;i++){
               ans.add(new ArrayList<>());
               for(int j=0;i<=i;j++){
                   if(j==0 || j==i) ans.get(i).set(j,1);  //arr[i][j] = 1
                   else{
                       int val =  ans.get(i-1).get(j)+ans.get(i-1).get(j); // val = arr[i][j] + arr[i-1][j-1]
                       ans.get(i).set(j,val);
                   }
               }
           }
           return ans;
    }
}
