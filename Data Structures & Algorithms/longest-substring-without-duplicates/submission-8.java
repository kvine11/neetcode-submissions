class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len = 0;
        Set<Character> letters = new HashSet<>();
        int head = 0;
        int tail = 0;

        while(head < s.length())
        {
            while(letters.contains(s.charAt(head)))
            {
                letters.remove(s.charAt(tail));
                tail++;

            }
            letters.add(s.charAt(head));
            head++;
            len = Math.max(len, head - tail);
        }

        return len;
}
}
