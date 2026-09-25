class Solution {

    public int repeatedStringMatch(String a, String b) {

        StringBuilder text = new StringBuilder();
        int count = 0;

        while (text.length() < b.length()) {
            text.append(a);
            count++;
        }

        text.append(a);

        String str = b + "$" + text;
        int n = str.length();
        int m = b.length();

        int zarr[] = new int[n];

        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {

            if (i <= right) {
                zarr[i] = Math.min(right - i + 1,zarr[i - left]);
            }

            while (i + zarr[i] < n &&
                   str.charAt(zarr[i])==str.charAt(i + zarr[i])) {
                zarr[i]++;
            }

            if (i + zarr[i] - 1 > right) {
                left = i;
                right = i + zarr[i] - 1;
            }

            if (zarr[i] == m) {

                int start = i - m - 1;

                if (start + m <= count * a.length()) {
                    return count;
                }

                return count + 1;
            }
        }

        return -1;
    }
}