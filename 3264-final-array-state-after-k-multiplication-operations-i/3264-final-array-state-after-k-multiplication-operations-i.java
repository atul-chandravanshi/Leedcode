class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            // Step 1: Find the minimum element in the array
            int minIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            
            // Step 2: Multiply the minimum element by the multiplier
            nums[minIndex] *= multiplier;
            
            // Step 3: Decrement k
            k--;
        }
        return nums;
    }
}
