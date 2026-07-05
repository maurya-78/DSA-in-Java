package OOPS;

public class UserDefineDataType {
    public static class Student{
       String name;
       int rno;
       double cgpa;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rno = 2313781;
        s1.cgpa = 6.81;

        Student s2 = new Student();
        s2.name = "Sahil";
        s2.rno = 2414976;
        s2.cgpa = 7.1;
        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        System.out.println(s2.name+" "+s2.rno+" "+s2.cgpa);
        s1.cgpa = 7.5;
        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
    }
}
