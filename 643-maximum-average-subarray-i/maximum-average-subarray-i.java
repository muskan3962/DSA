class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        int st =0;
        int end =k;
        int max = sum;
        while(end<nums.length){
            sum-=nums[st];
            st++;
            sum+=nums[end];
            end++;
            max = Math.max(max,sum);
        }
        return (double) max/k;
    }
}