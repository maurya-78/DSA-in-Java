package Arrays;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];   // or int max =Integer.MIN_VALUE;
        for(int i =1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element = " + max);
    }
}
