class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     int count=0;
     int rem[]=new int[k];
    rem[0]=1;
    int prefixs=0;
     for(int num:nums){
        prefixs=num+prefixs;

        int remainder=(prefixs%k+k)%k;

        count+=rem[remainder];

        rem[remainder]++;
     }
    return count;

    }
}