package Arrays;

public class Segregate0And1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,1,0,1};
        int numberOfZeros = 0;
        int numberOfOnes = 0;
        for(int ele : arr){
            if(ele == 0){
                numberOfZeros++;
            }else{
                numberOfOnes++;
            }
        }
        int index = 0;
        for(int i = 0; i < numberOfZeros; i++){
            arr[index++] = 0;
        }
        for(int i = 0; i < numberOfOnes; i++){
            arr[index++] = 1;
        }
        for(int ele : arr)
        System.out.print(ele+" ");
    }
}
