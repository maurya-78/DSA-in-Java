package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2,8,10,12};
        int[] b = {1,3,4,5,7,9,11};

        int[] c = new int[a.length+b.length];
        for(int ele : c) System.out.print(ele +" ");
        System.out.println();
        merge(c,a,b);
        for(int ele:c) System.out.print(ele+" ");
        System.out.println();
    }
    public static void merge(int[] c, int[] a, int[] b){
        int i=a.length-1, j=b.length-1,k=c.length-1;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i--;
                k--;
            }else{
                c[k] = b[j];
                j--;
                k--;
            }
        }
        while(j<b.length){

            c[k] = b[j];
            j--;
            k--;
        }
        while(i<a.length) {
            c[k] = a[i];
            i--;
            k--;
        }
    }
}


//package Arrays;
//
//public class MergeTwoSortedArray {
//    public static void main(String[] args) {
//        int[] a = {2,8,10,12};
//        int[] b = {1,3,4,5,7,9,11};
//
//        int[] c = new int[a.length+b.length];
//        for(int ele : c) System.out.print(ele +" ");
//        System.out.println();
//        merge(c,a,b);
//        for(int ele:c) System.out.print(ele+" ");
//        System.out.println();
//    }
//    public static void merge(int[] c, int[] a, int[] b){
//        int i=0, j=0,k=0;
//        while(i<a.length && j<b.length){
//            if(a[i]<b[j]){
//                c[k] = a[i];
//                i++;
//                k++;
//            }else{
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//        }
//            while(j<b.length){
//
//                    c[k] = b[j];
//                    j++;
//                    k++;
//            }
//        while(i<a.length) {
//            c[k] = a[i];
//            i++;
//            k++;
//          }
//        }
//    }

