class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int lps[]=new int[n];
        int start=0;
        int end=1;
        while(end<n){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                lps[end]=start;
                end++;
            }else if(start!=0){
                start=lps[start-1];
            }else{
                lps[end]=0;
                end++;
            }
        }
        return s.substring(0,lps[n-1]);
    }
}