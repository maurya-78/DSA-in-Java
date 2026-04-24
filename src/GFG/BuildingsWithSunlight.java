package GFG;

public class BuildingsWithSunlight {
    class Solution {
        static int visibleBuildings(int arr[]) {
            int count = 0;
            int max = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] >= max){
                    count++;
                    max = arr[i];
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 4, 11, 13};
        System.out.println("Output is :" + BuildingsWithSunlight.Solution.visibleBuildings(arr));
    }
}
