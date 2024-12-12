class Solution {
    public long pickGifts(int[] gifts, int k) {
     PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all gift piles to the max heap
        for (int gift : gifts) {
            maxHeap.add(gift);
        }

        // Process for k seconds
        for (int i = 0; i < k; i++) {
            // Get the largest pile
            int maxGift = maxHeap.poll();
            
            // Reduce the pile and put the remaining gifts back
            int remainingGift = (int) Math.floor(Math.sqrt(maxGift));
            maxHeap.add(remainingGift);
        }

        // Calculate the sum of all remaining gifts
        long totalGifts = 0;
        while (!maxHeap.isEmpty()) {
            totalGifts += maxHeap.poll();
        }

        return totalGifts;
    }
}