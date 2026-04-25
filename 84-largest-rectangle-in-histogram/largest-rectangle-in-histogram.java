class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse =new int[n];
        // find the next small element
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty()&& heights[st.peek()]> heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                nse[i] = st.peek();
            }
            else{
                nse[i] = n;
            }
            st.push(i);
        }
        // emptying the stack
        while(!st.isEmpty()) st.pop();
        // previous smaller element
        int[] pse =new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& heights[st.peek()]>= heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                pse[i] = st.peek();
            } 
            else{
                pse[i] = -1;
            }
            st.push(i);
        }
        int max =-1;
        for(int i=0;i<n;i++){
            int area = heights[i]*(nse[i]-pse[i]-1);
            max = Math.max(max,area);
        }

            return max;
    }
}