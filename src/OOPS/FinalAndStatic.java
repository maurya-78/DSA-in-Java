package OOPS;
class Cricketer{
    //final String country = "India";
    static String country;
    int runs;
    String name;
    double avg;
}
public class FinalAndStatic {
    public static void main(String[] args) {
       Cricketer c1 = new Cricketer();
      //  c1.country = "England";  // final method can not be change the value
//        System.out.println(c1.country);
          Cricketer c2 = new Cricketer();
//        System.out.println(c2.country);

        c1.country = "India";
        System.out.println(c2.country );
    }
}
