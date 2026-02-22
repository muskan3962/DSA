class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int maxGap =0;
        for(int i =0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){// geting first 1
                for(int j = i+1;j<binary.length();j++){
                    if(binary.charAt(j)=='1'){
                        maxGap = Math.max(maxGap,j-i);
                        break;
                    }
                }
            }
        }
        return maxGap;
    }
}