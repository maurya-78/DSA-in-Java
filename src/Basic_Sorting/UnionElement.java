package Basic_Sorting;

import java.util.*;

public class UnionElement {

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 1, 1, 4, 5, 5};
        int[] b = {6, 1, 1, 4, 4, 2, 8};

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                if (ans.isEmpty() || ans.get(ans.size()-1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size()-1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            }
            else {
                if (ans.isEmpty() || ans.get(ans.size()-1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }

        // remaining elements
        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size()-1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size()-1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        System.out.println(ans);
    }
}