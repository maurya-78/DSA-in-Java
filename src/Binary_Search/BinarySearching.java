package Binary_Search;

public class BinarySearching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 3;
        int n= arr.length;
        int low=0;
        int high=n-1;
        while(low <= high){
            int mid =(high+low)/2;
            if(arr[mid]==target){
                System.out.print(mid+" ");
                break;
            }else if(arr[mid]>target){
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid+1;
            }
        }
    }
}
