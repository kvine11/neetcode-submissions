class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int left = 0;

        Set<Character> substring = new HashSet<>();

        for(int r = 0; r  <s.length(); r++)
        {
            while(substring.contains(s.charAt(r)))
            {
                substring.remove(s.charAt(left));
                left++;
            }

            substring.add(s.charAt(r));
            len = Math.max(len, r - left + 1);
        }

        return len;
    }
}
