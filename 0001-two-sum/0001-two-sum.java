class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    int[] Arr= new int[2];
    for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
              Arr[0]=i;
              Arr[1]=j;
              break;
            }
        }
    }

    return Arr;
    }
}