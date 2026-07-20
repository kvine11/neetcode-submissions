class Solution {
    public boolean isPalindrome(String s) {
        // try to do it without using extra memory for the cleaned string

        int end = s.length() - 1;
        int beg = 0;

        while (beg < end) {
            while (beg < end &&!isAlpha(s.charAt(beg))) {
                beg += 1;
            }

            while (beg < end && !isAlpha(s.charAt(end))) {
                end -= 1;
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
        return ((s >= 'A' && s <= 'Z') || (s >= 'a' && s <= 'z') || (s >= '0' && s <= '9'));
    }
}
