class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
         double maxAvg = (double)sum/k;
        int left =0;
        int right =k;
        while(right<nums.length){
             sum= sum-nums[left];
             sum =sum+nums[right];
             maxAvg = Math.max(maxAvg,(double)sum/k);
             left++;
             right++;
        }
        return maxAvg;
    }
}