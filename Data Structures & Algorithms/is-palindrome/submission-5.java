class Solution {
    public boolean isPalindrome(String s) {
        int beg = 0;
        int end = s.length() - 1;

        while (beg < end) {
            while (beg < end && !isAlpha(s.charAt(beg))) {
                beg++;
            }

            while (beg < end && !isAlpha(s.charAt(end))) {
                end--;
            }

            if (!s.substring(beg, beg + 1)
                    .toLowerCase()
                    .equals(s.substring(end, end + 1).toLowerCase())) {
                return false;
            }

            beg++;
            end--;
        }

        return true;
    }

    public boolean isAlpha(char s) {
        return ((s >= '0' && s <= '9') || (s >= 'A' && s <= 'Z') || (s >= 'a' && s <= 'z'));
    }
}
