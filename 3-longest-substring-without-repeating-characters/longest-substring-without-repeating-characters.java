class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s == null){
            return 0;
        }
        if(s.length() == 1 ){
            return 1;
        }
        Set<Character> set = new HashSet<>();
        int i =0;
        int j=0;
        int length =0;
        while(j<s.length()){
            char ch = s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            length = Math.max(length,j-i+1);
            j++;
        }
        return length;
    }
}