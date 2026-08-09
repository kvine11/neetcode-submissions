class Solution {
    public int lengthOfLongestSubstring(String s) {
        int tail = 0;
        int head = 0;
        HashSet<Character> substring = new HashSet<>();
        int len = 0;

        while(head < s.length())
        {
            while(substring.contains(s.charAt(head)))
            {
                substring.remove(s.charAt(tail));
                tail++;
            }

            substring.add(s.charAt(head));
            head++;
            len = Math.max(len, substring.size());
        }

        return len;

    }
}
