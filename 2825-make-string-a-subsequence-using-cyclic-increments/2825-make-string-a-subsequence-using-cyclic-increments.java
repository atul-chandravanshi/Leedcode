class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int i = 0, j = 0;
        
       
        while (i < n && j < m) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);

          
            if (c1 == c2 || (c1 + 1) % 26 == c2 % 26) {
                j++; 
            }
            i++; 
        }
        
      
        return j == m;
    }
}
