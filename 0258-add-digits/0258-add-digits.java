class Solution {
    public int addDigits(int num) {
        
        if (num == 0) {
            return 0; // Edge case for 0
        } else if (num % 9 == 0) {
            return 9; // Special case when divisible by 9
        } else {
            return num % 9; // General case
        }
    
    }
}