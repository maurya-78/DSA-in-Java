package Recursion;

import java.util.Scanner;

public class Fibonacci {
    class Solution {
        static int nthFibonacci(int n) {
            if(n<=1) return n;                                      //main logic
            return nthFibonacci(n-1) + nthFibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci is: " + Fibonacci.Solution.nthFibonacci(n));

        sc.close();
    }
}
