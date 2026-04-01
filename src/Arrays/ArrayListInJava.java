package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));
        arr.set(3,50);  //arr[3] = 50

        System.out.println(arr);  // not traversing the array by ourselves

        int n = arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        // 25 21 18 50 10
        arr.add(78); // 25 21 18 50 10 78
        arr.add(1,100);  // 25 100 21 18 50 10 78
        System.out.println(arr+" ");
        arr.remove(arr.size()-1);
        System.out.println(arr);

        int i=0, j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        //Collections.reverse(arr);
        System.out.println(arr);
    }
}
