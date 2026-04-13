class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length ==0){
            return 0;
        }
        for(int i:nums){
            set.add(i);
        }
        int longestSub =1;
        for(int i :set){
            if(set.contains(i-1)){
                continue;
            }
            else{
                int curr = i;
                int currSub =1;
                while(set.contains(curr+1)){
                    curr++;
                    currSub++;
                }
                longestSub = Math.max(longestSub,currSub);
            }
        }
        return longestSub;
    }
}