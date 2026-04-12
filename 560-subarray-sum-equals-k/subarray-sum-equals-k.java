class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
       int currSum =0;
       Map<Integer,Integer> prefixSum = new HashMap<>();
       prefixSum.put(0,1);
       for(int num:nums){
        currSum+=num;
          count+=prefixSum.getOrDefault(currSum-k,0);
          prefixSum.put(currSum,prefixSum.getOrDefault(currSum,0)+1);
       }
       return count;
    }
}