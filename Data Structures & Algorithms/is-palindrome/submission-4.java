class Solution {
    public boolean isPalindrome(String s) {
        
        int beg = 0;
        int end = s.length() - 1;

        while(beg < end)
        {
            while(!isAlpha(s.charAt(beg)) && beg < end)
            {
                beg++;
            }

            while(!isAlpha(s.charAt(end)) && beg < end)
            {
                end--;
            }

            if(!s.substring(beg, beg + 1).toLowerCase().equals(s.substring(end, end + 1).toLowerCase()))
            {
                return false;
            }

            beg++;
            end--;
        }

        return true;
    }

    public boolean isAlpha(char s)
    {
        return ((s >= '0' && s <= '9') || (s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z'));
    }
}
