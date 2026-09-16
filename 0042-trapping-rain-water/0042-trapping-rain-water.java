class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int lmax=0;
        int right=n-1;
        int rmax=0;
        int amount=0;
        while(left<right){
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);

            if(height[left]<=height[right]){
                amount=amount+lmax-height[left];

                left++;
            }else{
                amount=amount+rmax-height[right];
                right--;
            }
        }
        return amount;
    }
}