class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int hh =0;hh<12;hh++){
            for(int mm =0;mm<60;mm++){
                int totalBits = Integer.bitCount(hh)+Integer.bitCount(mm);
                if(totalBits == turnedOn){
                    String time = hh + ":"+(mm<10 ? "0"+mm :mm);
                    ans.add(time);
                }

            }
        }
        return ans;
    }
}