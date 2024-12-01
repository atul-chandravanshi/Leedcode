import java.util.HashMap;

class Solution {
    public boolean digitCount(String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] c = num.toCharArray();

  
        for (char d : c) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

       
        for (int i = 0; i < c.length; i++) {
            if (map.getOrDefault((char) ('0' + i), 0) != Character.getNumericValue(c[i])) {
                return false;
            }
        }

        return true;
    }
}
