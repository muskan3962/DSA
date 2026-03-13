class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1,i=0,j=1,k=0,seen=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                j++;
                k++;
                seen=0;
                count++;
                 nums[k] = nums[i];
            }else if(nums[i]==nums[j]&& seen ==0){
                i++;
                j++;
                k++;
                seen = 1;
                count++;
                nums[k] = nums[i];
            }else{
                j++;
                i++;
               
            }
        }
        return count;
    }
}