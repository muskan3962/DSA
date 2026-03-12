class Solution {
    public int removeDuplicates(int[] nums) {
     int count =1, k =1,i =1;
    
     while(i<nums.length){
            if(nums[i-1]== nums[i]){
                i++;
            }else{
                nums[k] = nums[i];
                k++;
                count++;
                i++;
            }
     } 
     return count;  
    }
}