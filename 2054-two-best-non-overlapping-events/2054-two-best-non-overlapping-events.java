class Solution {
    public int maxTwoEvents(int[][] events) {
        
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));

        int n = events.length;
        int[] maxValue = new int[n];
        maxValue[0] = events[0][2];
        int maxSum = events[0][2];

       
        for (int i = 1; i < n; i++) {
            maxValue[i] = Math.max(maxValue[i - 1], events[i][2]);
        }
        for (int i = 0; i < n; i++) {
            int value = events[i][2];
            
            
            int left = 0, right = i - 1, bestIndex = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (events[mid][1] < events[i][0]) {
                    bestIndex = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }


            if (bestIndex != -1) {
                value += maxValue[bestIndex];
            }
            
         
            maxSum = Math.max(maxSum, value);
        }

        return maxSum;
    }
}