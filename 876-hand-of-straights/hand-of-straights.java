class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize !=0)return false;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:hand){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> minQ = new PriorityQueue<>(mp.keySet());
        while(!minQ.isEmpty()){
            int first = minQ.peek();
            for(int i = first;i<first+groupSize;i++){
                if(!mp.containsKey(i))return false;
                mp.put(i,mp.get(i)-1);
                if(mp.get(i)==0){
                    if(i !=minQ.peek())return false;
                    minQ.poll();
                }
            }
        }
        return true;
    }
}