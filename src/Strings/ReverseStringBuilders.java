package Strings;

public class ReverseStringBuilders {
    public static void main(String[] args) {
        String s = "Rahul";
        StringBuilder sb = new StringBuilder(s);
        sb.append("Maurya");
        System.out.println(sb);
        sb.deleteCharAt(1);  // delete the index value
        System.out.println(sb);
        sb.insert(1,'a');
        System.out.println(sb);
        //sb.reverse();
        int i=0, j=sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);

        String str = "Aditya";
        StringBuilder sb1 = new StringBuilder(str);
        sb1.reverse();
        str = sb1.toString();
        System.out.println(str);
    }
}
