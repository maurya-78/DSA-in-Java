package Recursion;

public class GCD {
   static class Solution {
        public static int gcd(int a, int b) {
            if(a==0) return b;
            return gcd(b%a,a);
        }
    }
    public static void main(String[] args) {

    }
}
