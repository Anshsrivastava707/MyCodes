class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxm=0;
        while(left<right){
            int curr=Math.min(height[left],height[right])*(right-left);
            maxm=Math.max(maxm,curr);
        
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
    }
    return maxm;
    }
}