package OOPS;

class A{
    int x  = 10;
    void show(){
        System.out.println(x);
    }
}
class B extends A{
    int x = 20;
    void show(){
        System.out.println(x);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
