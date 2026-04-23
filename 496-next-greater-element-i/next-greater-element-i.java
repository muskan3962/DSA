class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            int nge = -1;
            int j ;
            for(j =0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])break;
            }
            for(int k = j+1;k<nums2.length;k++){
                if(nums2[k]>nums2[j]){
                    nge = nums2[k];
                    break;
                }
            }
            res[i] = nge;
        }
        return res;
    }
}