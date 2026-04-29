package GFG;
public class SmallestSubString{
    public static int smallestSubString(String s) {
        int[] count = new int[3];
        int left = 0;
        int unique = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - '0';
            if (count[idx] == 0) {
                unique++;
            }
            count[idx]++;
            while (unique == 3) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                }
                int leftIdx = s.charAt(left) - '0';
                count[leftIdx]--;
                if (count[leftIdx] == 0) {
                    unique--;
                }
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minLength;
        }
    }
    // Main method
    public static void main(String[] args) {
        String s = "10212";
        int result = smallestSubString(s);
        System.out.println("Answer: " + result);
    }
}
