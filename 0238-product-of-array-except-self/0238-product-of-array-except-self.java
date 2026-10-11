class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int suffix[]=new int[n];
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        int ans[]=new int[n];
        int prefix=1;
        for(int i=0;i<n;i++){
            ans[i]=prefix*suffix[i];
            prefix=prefix*nums[i];
        }
        return ans;
    }
}