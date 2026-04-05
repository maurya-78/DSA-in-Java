package Binary_Search;
import java.util.Arrays;
public class FindTripletsWithZeroSum {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static boolean zeroSum(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == 0) return true;
                else if (sum < 0) left++;
                else right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(zeroSum(arr ));
    }
}
