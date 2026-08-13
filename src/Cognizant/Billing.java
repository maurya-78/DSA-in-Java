package Cognizant;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Pizza:");
        int pizza = sc.nextInt();
        System.out.print("Enter the number of Puff:");
        int puff = sc.nextInt();
        System.out.print("Enter the number of coldDrink:");
        int coldDrink = sc.nextInt();

        int pizzaa = Math.abs(pizza)*100;
        int puffaa = Math.abs(puff)*20;
        int coldDrinkk = Math.abs(coldDrink)*10;
        int totalPrice = pizzaa + puffaa +coldDrinkk;
        System.out.println("Total billing is:"+" "+totalPrice);
    }
}
