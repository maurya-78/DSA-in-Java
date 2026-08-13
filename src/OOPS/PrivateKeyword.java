package OOPS;

import java.util.Scanner;

public class PrivateKeyword {
    public static class Students{
        String name;  // null
        private int rno;  //0
        double cgpa;  //0.0
        private void print(){
            System.out.println(name+" "+cgpa+" "+rno);
        }
        public void p(){
            print();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        s1.print();
        s1.cgpa = 8.5;
        s1.name = "Maurya";
        s1.rno = 25;
        s1.p();
        Students s2 = new Students();
        s2.p();

//        StringBuilder sb = new StringBuilder(sc.nextLine());
//        System.out.println(sb);
    }
}
