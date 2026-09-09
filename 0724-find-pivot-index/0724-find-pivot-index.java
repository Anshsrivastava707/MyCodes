class Solution {
    public int pivotIndex(int[] nums) {
        //if(nums.length==0 || nums.length==1) return nums.length-1;
        int [] prefix=new int[nums.length];
        prefix[0]=nums[0];
        System.gc();
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
    
        for(int i=nums.length-2;i>=0;i--){
            nums[i]=nums[i]+nums[i+1];
        }
    
        for(int i=0;i<nums.length;i++){
            if(prefix[i]==nums[i]) return i;
        }
        return -1;
       
    }
}