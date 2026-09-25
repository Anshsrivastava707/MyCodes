class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int lps[] = new int[needle.length()];
        int start = 0;
        int end = 1;
        
        while (end < needle.length()) { 
            if (needle.charAt(end) == needle.charAt(start)) {
                start++;
                lps[end] = start;
                end++;
            } else if (start != 0) {
                start = lps[start - 1];
            } else {
                lps[end] = 0;
                end++;
            }
        }

        int Hidx = 0;
        int Nidx = 0;
        
        while (Hidx < haystack.length()) {
            if (haystack.charAt(Hidx) == needle.charAt(Nidx)) { 
                Hidx++;
                Nidx++;
            } else if (Nidx != 0) { 
                Nidx = lps[Nidx - 1]; 
            } else {
                Hidx++; 
            }

            if (Nidx == needle.length()) {
                return Hidx - needle.length();
            }
        }
        
        return -1; 
    }
}
