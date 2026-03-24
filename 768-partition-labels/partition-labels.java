class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        // filling map
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,i);
        }
        List<Integer> res= new ArrayList<>();
        int prev =-1;
        int max = 0;
        for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);
            max = Math.max(max,mp.get(ch));
            if(max ==i){
                res.add(max-prev);
                prev = max;
            }
        }
        return res;
    }
}