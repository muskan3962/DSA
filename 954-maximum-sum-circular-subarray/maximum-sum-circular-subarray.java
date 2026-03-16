class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0],minSum = nums[0];
        int curMax = 0,curMin =0,total =0;
        for(int i:nums){
            curMax = Math.max(curMax+i,i);
            curMin = Math.min(curMin+i,i);
            total += i;
            maxSum = Math.max(maxSum,curMax);
            minSum = Math.min(minSum,curMin);
        }
        return maxSum>0?Math.max(maxSum,total-minSum):maxSum;
    }
}