class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);

        int count=0;
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<pairs.length;i++){

            int start=pairs[i][0];
            int end=pairs[i][1];

            if(start>temp){
                count++;
                temp=end;
            }
        }
        return count;
    }
}