class Solution {
    public String shortestPalindrome(String s) {
        if(s.length()<=1)return s;
        String rev=new StringBuilder(s).reverse().toString();
        String combined=s+'#'+rev;

        int n=combined.length();
        int start=0;
        int end=1;
        int lps[]=new int[n];
        while(end<n){
            if(combined.charAt(start)==combined.charAt(end)){
                ++start;
                lps[end]=start;
                end++;
            }else if(start!=0){
                start=lps[start-1];
            }else{
                lps[end]=0;
                end++;
            }
        }
        String rem=s.substring(lps[n-1]);
        return new StringBuilder(rem).reverse().toString()+s;
    }
}