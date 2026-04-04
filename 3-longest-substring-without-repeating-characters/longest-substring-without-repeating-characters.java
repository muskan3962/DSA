class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,l=0;
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>1){
                char leftchar = s.charAt(l);
                mp.put(leftchar,mp.get(leftchar)-1);
                l++;
            }
            max = Math.max(max,i-l+1);
        }
        return max;
    }
}