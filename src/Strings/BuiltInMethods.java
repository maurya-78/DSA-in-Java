package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "Rahul Maurya";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('k'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.contains("Rahul"));
        if(s.contains("ahul")){
            System.out.println(" K");
            System.out.println(s);
        }
    }
}
