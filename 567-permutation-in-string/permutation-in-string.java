class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        if(s1.length()> s2.length())return false;
        for(char c: s1.toCharArray()){
            count1[c-'a']++;
        }
        // first window
        for(int i =0;i<s1.length();i++){
            count2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(count1,count2)) return true;
        for(int i  = s1.length();i<s2.length();i++){
            count2[s2.charAt(i)-'a']++; // adding new element
            count2[s2.charAt(i-s1.length())-'a']--;// removing from starting 
            if(Arrays.equals(count1,count2))return true;
        }
        return false;
    }
}