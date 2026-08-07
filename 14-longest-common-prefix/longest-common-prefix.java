class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs,Comparator.comparingInt(String::length));
        StringBuilder ans = new StringBuilder("");
        String firstStr = new String(strs[0]);
            for(int i=0;i<strs[0].length();i++){
                for(int j=1;j<strs.length;j++){
                    if(strs[j].charAt(i)!=firstStr.charAt(i)){
                        return ans.toString();
                    }
                }
                ans.append(firstStr.charAt(i));
            }
        return ans.toString();
    }
}