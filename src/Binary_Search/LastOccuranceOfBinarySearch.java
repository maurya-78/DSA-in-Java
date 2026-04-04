package Binary_Search;

public class LastOccuranceOfBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,6,7,8,9,10};
        int target = 3;
        int n= arr.length;
        int low=0;
        int high=n-1;
        int ans =-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]>target){
                high = mid-1;
                System.out.println();
            }else low = mid+1;
        }
        System.out.println(ans);
    }
}
