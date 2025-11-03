class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) {

            if (!map.containsKey(i)) {
                map.put(i, true);
                list.add(i);
            }


        }
        int i = 0;
        for(int z:list){
          nums[i]=z;
          i++;
        }
        return list.size();

    }

}