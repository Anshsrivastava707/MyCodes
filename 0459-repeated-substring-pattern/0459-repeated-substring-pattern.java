class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int start=0;
        int end=1;
        int lps[]=new int[n];
        while(end<n){
            if(s.charAt(end)==s.charAt(start)){
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
        int length=lps[n-1];
        return length>0 && n%(n-length)==0;
    }
}