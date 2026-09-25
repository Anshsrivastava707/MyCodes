class Solution {

    public int repeatedStringMatch(String a, String b) {

        StringBuilder text = new StringBuilder();
        int count = 0;

        while (text.length() < b.length()) {
            text.append(a);
            count++;
        }

        String str = b + "$" + text.toString();

        int n = str.length();
        int m = b.length();

        int zarr[] = new int[n];

        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {

            if (i <= right) {
                zarr[i] = Math.min(right - i + 1,
                    zarr[i - left]);
            }

            while (i + zarr[i] < n &&
                   str.charAt(zarr[i]) ==
                   str.charAt(i + zarr[i])) {

                zarr[i]++;
            }

            if (i + zarr[i] - 1 > right) {
                left = i;
                right = i + zarr[i] - 1;
            }

            if (zarr[i] == m) {
                return count;
            }
        }
        text.append(a);

        str = b + "$" + text.toString();

        n = str.length();
        zarr = new int[n];

        left = 0;
        right = 0;

        for (int i = 1; i < n; i++) {

            if (i <= right) {
                zarr[i] = Math.min(right - i + 1,
                                   zarr[i - left]);
            }

            while (i + zarr[i] < n &&
                   str.charAt(zarr[i]) ==
                   str.charAt(i + zarr[i])) {

                zarr[i]++;
            }

            if (i + zarr[i] - 1 > right) {
                left = i;
                right = i + zarr[i] - 1;
            }

            if (zarr[i] == m) {
                return count + 1;
            }
        }
        return -1;
    }
}