class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
    Set<Integer> list = new HashSet<>();
    for(int i: banned){
        list.add(i);
    } 
    int count=0;
    int sum=0;
    for(int i=1;i<=n;i++){
       if(!list.contains(i) && maxSum >= sum+i) {
        sum+=i;
        count++;
       }
       else if(sum+i>maxSum) break;
    }


    return count;
    }
}