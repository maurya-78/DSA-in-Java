package Recursion;

public class RecursionOnArraysInExists {
    public static void main(String[] args) {
        int[] arr = {5,3,7,12,76,9,34,5};
        int target = 76;
        System.out.println(exists(arr, target,0));
    }
    public static boolean exists(int[] arr, int target, int idx){
        int n = arr.length;
        if(idx == n) return false;
        if(arr[idx] == target) return true;
        return exists(arr, target, idx+1);
    }
}
