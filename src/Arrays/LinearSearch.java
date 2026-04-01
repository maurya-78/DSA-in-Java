//package Arrays;
//
//public class LinearSearch {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        int target = 5;
//        boolean flag = false;   //  target does not exit in the array
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == target){
//                flag = true;
//                break;
//            }
//        }
//        if(flag == true){
//            System.out.println("Target exits in Array");
//        }else{
//            System.out.println("Target missing in Array");
//        }
//    }
//}
//


package Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int target = 5;

        boolean flag = false;

        for(int num : arr){
            if(num == target){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Target exists in Array");
        }else{
            System.out.println("Target missing in Array");
        }
    }
}