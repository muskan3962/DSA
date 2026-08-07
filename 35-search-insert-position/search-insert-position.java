class Solution {
    public int searchInsert(int[] nums, int target) {
       int ans =0;
       for(int i =0;i<nums.length;i++){
         if(target == nums[i]){
        return i;
       }
       if(nums[i]>target){
        return ans;
       }
       ans =i+1;
       }
       return ans;
    }
   
}