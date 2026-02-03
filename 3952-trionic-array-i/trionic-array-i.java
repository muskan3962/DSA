class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n<3)return false;
        int i =0;
        while(i+1<n && nums[i]<nums[i+1])i++;
        if(i==0)return false;
        int peak =i;
        while(i+1<n && nums[i]>nums[i+1])i++;
        if(i==peak)return false;
        int vally = i;
        while(i+1<n && nums[i]<nums[i+1])i++;
        return i>vally && i==n-1;
    }
}