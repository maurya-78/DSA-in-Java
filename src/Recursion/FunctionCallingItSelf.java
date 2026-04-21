package Recursion;

//public class FunctionCallingItSelf {
//    public static void main(String[] args) {
//         aman(1);
//    }
//    public static void aman(int n){
//        if(n==10) return;
//        System.out.println("Rahul");
//        aman(n+1);
//    }
//}

public class FunctionCallingItSelf {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
