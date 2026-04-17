package MultiDimensionalArrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(13); a.add(36); a.add(132);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2); b.add(12); b.add(26); b.add(122);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(4); c.add(14); c.add(46); c.add(142);
        ArrayList< ArrayList<Integer> > arr = new ArrayList<>();
        arr.add(a); arr.add(a); arr.add(a);

        System.out.println(arr);
    }
}
