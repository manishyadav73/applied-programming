class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder res = new StringBuilder();

        int count = 1;

        for (int i = 1; i <= n; i++) {

            if (i < n && chars[i] == chars[i - 1]) {
                count++;
            } else {
                res.append(chars[i - 1]);

                if (count > 1) {
                    res.append(count);
                }

                count = 1;
            }
        }

        for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }

        return res.length();
    }
}