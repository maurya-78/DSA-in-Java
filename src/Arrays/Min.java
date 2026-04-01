package Arrays;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];   // or int min =Integer.MAX_VALUE;
        for(int i =1;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element = " + min);
    }
}
