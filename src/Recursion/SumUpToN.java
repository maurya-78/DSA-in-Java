package Recursion;

import java.util.Scanner;

public class SumUpToN {
    class Solution {
        public static int findSum(int n) {
            if(n==1) return 1;
            return n + findSum(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Up to "+ n +" is: " + SumUpToN.Solution.findSum(n));

        sc.close();
    }
}
