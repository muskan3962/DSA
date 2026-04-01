class Solution {
    public int jump(int[] nums) {
        int l = 0,r =0;
        int count =0;
        while(r<nums.length-1){
            int maxReach =0;
            for(int i=l;i<=r;i++){
                maxReach = Math.max(maxReach,i+nums[i]);

            }
            l = r+1;
            r = maxReach;
            count++;
        }
        return count;
    }
}