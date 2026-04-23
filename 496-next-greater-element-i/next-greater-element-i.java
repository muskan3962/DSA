class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
       
       for (int i = 0; i < nums2.length; i++) {
        int nge = -1;

        for (int j = i + 1; j < nums2.length; j++) {
            if (nums2[j] > nums2[i]) {
                nge = nums2[j];
                break;
            }
        }

        mp.put(nums2[i], nge);
    }

    // Build result for nums1
    int[] res = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        res[i] = mp.get(nums1[i]);
    }

    return res;
    }
}