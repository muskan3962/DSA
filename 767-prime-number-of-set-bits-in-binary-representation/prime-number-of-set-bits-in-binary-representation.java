class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans =0;
        for(int i = left;i<=right;i++){
            int setBit  = Integer.bitCount(i);
            if(setBit ==2 || setBit == 3|| setBit == 5|| setBit == 7|| setBit ==11 || setBit ==13 || setBit ==17 || setBit ==19)ans++;
        }
        return ans;
        
    }

    // private int numberOfSetBit(int n){
    //     int count =0;
    //     while(n!=0){
    //         n = n&(n-1);
    //         count++;
    //     }
    //     return count;
    // }
}