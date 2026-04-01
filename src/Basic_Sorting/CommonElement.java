package Basic_Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 1, 1, 4, 5, 5};
        int[] b = {6, 1, 1, 4, 4, 2, 8};
        print(a);
        print(b);
        Arrays.sort(a);
        Arrays.sort(b);
        print(a);
        print(b);
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else j++;
        }
        System.out.println("common elements"+ans);
    }
}
