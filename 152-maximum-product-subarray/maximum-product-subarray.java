class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        pre[0] = nums[0];
        for(int i =1;i<n;i++){ 
             if(pre[i-1]==0){
                pre[i]=nums[i];
             }else{
                pre[i] =  pre[i-1]*nums[i];
             }

            
        }
        post[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(post[i+1]==0){
                    post[i] =nums[i];
            }else{
                post[i] =  post[i+1]*nums[i];
            }
        }
        int ans = nums[0];
        for(int i=0;i<n;i++){
            ans = Math.max(ans,nums[i]);
            ans =Math.max(ans,Math.max(pre[i],post[i]));
        }
        return ans;
    }
}