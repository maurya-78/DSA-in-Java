package Recursion;
import java.util.Scanner;


public class GCD {
   static class Solution {
        public static int gcd(int a, int b) {
            if(a==0) return b;
            return gcd(b%a,a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD is: " + Solution.gcd(a, b));

        sc.close();
    }
}
