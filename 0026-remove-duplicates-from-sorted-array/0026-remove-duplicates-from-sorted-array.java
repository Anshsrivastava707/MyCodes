class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[l]){
                continue;
            }else{
                l++;
                nums[l]=nums[i];
            }
        }
        return l+1;
    }
}