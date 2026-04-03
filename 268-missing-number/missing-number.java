class Solution {
    public int missingNumber(int[] nums) {
        int total =0;
        int sum =0;
        int i=0;
        for( i = 0;i<nums.length;i++){
            total+=i;
            sum+=nums[i];
        }
        total = total+i;
        return total-sum;
    }
}