class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize !=0)return false;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:hand){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        Arrays.sort(hand);
        for(int j:hand){
            if(mp.get(j)>0){
               for(int k=j;k<j+groupSize;k++){
                if(mp.getOrDefault(k,0)==0)return false;
                mp.put(k,mp.get(k)-1);
            }
            }
       
        }
        return true;
    }
}