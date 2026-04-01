package Arrays;

import java.util.Scanner;

public class SumOfArrayAndProduct {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum of array element is: "+ sum);
        System.out.println("Product of array element is: "+ product);
    }
}
