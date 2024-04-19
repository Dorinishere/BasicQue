public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int k = 1; // Initialize k to 1, as the first element is always unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; // Move the unique element to the front
            }
        }
        
        return k;
    }
}
