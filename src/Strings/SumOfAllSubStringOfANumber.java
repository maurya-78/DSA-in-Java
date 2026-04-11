package Strings;

public class SumOfAllSubStringOfANumber {
    public static int sumSubstring(String s){
        int sum = 0;
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String subStr = s.substring(i,j);
                int num = Integer.parseInt(subStr);
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(sumSubstring(s));
    }
}
