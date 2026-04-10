class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(String s:strs){
            char[] freq = new char[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            // build key 
            StringBuilder keyBuilder = new StringBuilder();
            for(int i =0;i<26;i++){
                keyBuilder.append(freq[i]).append("#");
            }
            String key = keyBuilder.toString();
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}