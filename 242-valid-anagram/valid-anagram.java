class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i =0;i<t.length();i++){
            if(!mp.containsKey(t.charAt(i)))return false;
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)-1);
              if(mp.get(t.charAt(i))<1){
                mp.remove(t.charAt(i));
            }
        }
        return true;
    }
}