class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> map= new HashMap<>();
    String[] s1= s.split(" ");
    if (pattern.length() != s1.length) {
            return false;
        }
    for(int i=0;i<pattern.length();i++)
    {       
        char currentChar = pattern.charAt(i);
        if(map.containsKey(currentChar))
        {
          if(!map.get(currentChar).equals(s1[i]))
          {
          return false;
          }
        }

        else {
        if (map.containsValue(s1[i])) {
                    return false;
                }
        }
        map.put(currentChar,s1[i]);
    }
    return true;
    }
}