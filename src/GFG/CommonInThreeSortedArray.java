package GFG;

import java.util.ArrayList;

public class CommonInThreeSortedArray {
    public static ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> ans = commonElements(a, b, c);
        System.out.println(ans);
    }
}