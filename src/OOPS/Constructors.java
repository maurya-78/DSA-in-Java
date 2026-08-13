package OOPS;

public class Constructors {
    public static class Car{
        int seats; //0
        String name;  // null
        double length; //0.0
        Car(int x,String s, double d){
             seats = x;
             name = s;
             length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5, "Maruti",4.0);
        c1.print();
        Car c2 = new Car(5, "Kia",4.5);
        c2.print();
    }
}
