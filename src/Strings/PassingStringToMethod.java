package Strings;

public class PassingStringToMethod {
    public static void change(String  x){
       x= "maurya";
    }
    public static void main(String[] args) {
         String x = "rahul";
        System.out.println(x);
         change(x);
        System.out.println(x);
    }
}
