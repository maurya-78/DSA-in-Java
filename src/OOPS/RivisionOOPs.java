package OOPS;

public class RivisionOOPs {
    private static class Pokemon{
//        int hp;
//        int speed;
//        int attack;
//        int defense;
        int power;
        String type;
       // String name;

        Pokemon(String type, int power){
             this.power = power;
             this.type = type;
        }
        void print(){
            System.out.println(this.power+" "+this.type);
        }
    }
    public static void main(String[] args) {
//        Pokemon p1 = new Pokemon();
//        p1.name = "Pikachu"; p1.type = "Electric"; p1.attack=78;
//        Pokemon p2 = new Pokemon();
//        p2.name = "Charizard"; p2.type = "Fire"; p2.attack=110;
//        Pokemon p3 =p1 // p3 is shallow copy of p1 (can control)
//        System.out.println(p1.type);

        Pokemon pikachu = new Pokemon("Electric",70);
        Pokemon jigglypuff = new Pokemon("Fairy",50);

        pikachu.print();
        jigglypuff.print();

    }
}
