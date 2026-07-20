class Solution {
    public boolean isPalindrome(String s) {
        String noSpace = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        System.out.println(noSpace);

        for(int i = 0; i < noSpace.length() / 2; i++)
        {
            int beg = i;
            int end = noSpace.length() - 1 - beg;

            if(!noSpace.substring(beg, beg + 1).equals(noSpace.substring(end, end + 1)))
            {
                return false;
            }
        }

        return true;
    }
}
