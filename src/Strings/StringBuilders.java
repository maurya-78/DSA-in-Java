package Strings;

import java.util.ArrayList;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Rahul");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.append("Kumar");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        s.setCharAt(1,'o');
        System.out.println(s);
        String t = s.toString();
        System.out.println(s);
        s.append("RahulKumarMauryaHanumanganj");
        System.out.println(s.length()+" "+s.capacity());
    }
}
