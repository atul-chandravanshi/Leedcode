class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = prices[i]; // Initially set the result to the original price
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break; // Stop once we find the first discount
                }
            }
        }
        
        return result;
    }

    
}