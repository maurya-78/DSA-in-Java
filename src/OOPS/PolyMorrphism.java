package OOPS;

public class PolyMorrphism {
    public static class Dog {
        void speak() {
            System.out.println("Bhau Bhau");
        }
    }
    public static class People {
        void speak() {
            System.out.println("Speaking");
        }
    }
    public static class Cat {
        void speak() {
            System.out.println("Meow Meow");
        }
    }
    public static class Lion {
        void speak() {
            System.out.println("GRRRRRRR");
        }
    }
    public static void main(String[] args) {
        People p = new People();
        Cat c = new Cat();
        Dog d = new Dog();
        Lion l = new Lion();

        d.speak();
        c.speak();
        p.speak();
        l.speak();
    }
}
