class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int left =0;

        Set<Character> substring = new HashSet<>();

        for(int i = 0; i < s.length(); i++)
        {
            while(substring.contains(s.charAt(i)))
            {
                substring.remove(s.charAt(left));
                left++;
            }

            substring.add(s.charAt(i));
            len = Math.max(len, i - left + 1);
        }

        return len;
    }
}
