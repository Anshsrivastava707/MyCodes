// class Solution {
//     public int maxArea(int[] height) {
//         int left=0;
//         int right=height.length-1;
//         int maxm=0;
//         while(left<right){
//             int curr=Math.min(height[left],height[right])*(right-left);
//             maxm=Math.max(maxm,curr);
        
//         if(height[left]<height[right]){
//             left++;
//         }else{
//             right--;
//         }
//     }
//     return maxm;
//     }
// }

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxamt=0;
        
        while(left<right){
            int amt=Math.min(height[left],height[right])*(right-left);
            maxamt=Math.max(maxamt,amt);

            if(height[left]<height[right]){
                left++;
            }else{
                right --;
            }
        }
        return maxamt;
    }
}