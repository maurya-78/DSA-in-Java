package Arrays;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
            // Printing Negative Values

            for(int i=0;i<n;i++){
                if(arr[i]<0){
                    System.out.println(arr[i]+" ");
                }
            }









//       int[] x = new int[8];
//       for( int i = 0; i < x.length; i++){
//           x[i] = sc.nextInt();
//           if(x[i] < 0){
//               System.out.println(x[i] +" ");
//           }
//       }
    }
}