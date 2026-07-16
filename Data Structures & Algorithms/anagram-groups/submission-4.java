class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h = new HashMap<String, List<String>>();


        for(int i = 0; i < strs.length; i++)
        {
            int [] frequency = new int[26];
            for(char c : strs[i].toCharArray())
            {
                frequency[c - 'a']++;
            }

            String newFreq  = Arrays.toString(frequency);

            if(h.get(newFreq) == null)
            {
                h.put(newFreq, new ArrayList<>());
                h.get(newFreq).add(strs[i]);
            }
            else
            {
                h.get(newFreq).add(strs[i]);
            }
        }

        return new ArrayList<>(h.values());
    }
}
