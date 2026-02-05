class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int shift = nums[i]%n;
            int newIndex = (i+shift)%n;
            if(newIndex<0){
                newIndex+=n;
            }
            ans[i] = nums[newIndex];
        }
        return ans;
    }
}