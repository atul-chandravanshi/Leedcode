class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
       int low = 1, high = getMax(nums), result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canDivide(nums, maxOperations, mid)) {
                result = mid; 
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return result;
    }

    
    private static int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

  
    private static boolean canDivide(int[] nums, int maxOperations, int maxPenalty) {
        int operationsNeeded = 0;
        for (int num : nums) {
            if (num > maxPenalty) {
                operationsNeeded += (num - 1) / maxPenalty; 
            }
            if (operationsNeeded > maxOperations) return false;
        }
        return true;
    }

}