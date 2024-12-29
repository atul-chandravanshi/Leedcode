class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        int length = 0;
        boolean hasOdd = false;
        
    
        for (int count : frequencyMap.values()) {
           
            length += count / 2 * 2;
            
            if (count % 2 != 0) {
                hasOdd = true;
            }
        }
        
     
        if (hasOdd) {
            length += 1;
        }
        
        return length;
     
    }
}