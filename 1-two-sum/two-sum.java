class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] ans = new int[2];
        for(int i =0;i<nums.length;i++){
            int patner = target-nums[i];
            if(mp.containsKey(patner)){
                ans[0] =i;
                ans[1] = mp.get(patner);
                return ans;
            }else{
                mp.put(nums[i],i);
            }
        }
        return ans;
    }
}