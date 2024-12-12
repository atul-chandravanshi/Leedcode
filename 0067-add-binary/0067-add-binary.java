class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int t1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int t2 = j >= 0 ? b.charAt(j) - '0' : 0;

            int sum = t1 + t2 + carry;
            result.append(sum % 2); 
            carry = sum / 2;       

            i--;
            j--;
        }

      
        result.reverse();

      
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}