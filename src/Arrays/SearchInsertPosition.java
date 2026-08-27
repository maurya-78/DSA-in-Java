package Arrays;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element of the array:");
        for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();

        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                System.out.println("Mid value is:"+mid);
            }else if(arr[mid]<target){
                left = mid + 1;
                System.out.println("left value is:"+left);
            }else{
                right = mid -1;
                System.out.println("Right value is:"+right);
            }
        }
        System.out.println("Insert position is:"+left);
    }
}
