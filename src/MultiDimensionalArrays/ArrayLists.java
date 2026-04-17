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
        arr.add(a); arr.add(b); arr.add(c);

        //System.out.println(arr);
//        for( int i=0;i<arr.size();i++){
//            for(int j=0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        for(ArrayList<Integer> List : arr){
            for(int ele : List){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
