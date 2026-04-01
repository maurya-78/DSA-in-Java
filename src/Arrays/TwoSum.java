package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum");
    }

    public static boolean twoSum(int arr[], int sum){
        for(int i=0;i< arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if((arr[i]+arr[j] == sum)){
                  return true;
                }
            }
        }
        return false;
    }
}
