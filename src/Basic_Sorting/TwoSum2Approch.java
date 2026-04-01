package Basic_Sorting;

import java.util.Arrays;

public class TwoSum2Approch {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static boolean twosum(int[] arr, int target) {
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        while(i<j){
            int sum =arr[i]+arr[j];
            if(sum == target){
                return true;
            } else if (sum < target) {
                i++;
            }else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,7,3};
        int target = 0;
        System.out.println(twosum(arr , target));
    }
}
