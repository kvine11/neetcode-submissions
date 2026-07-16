class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h = new HashMap<String, List<String>>();

        for(int i = 0; i < strs.length; i++)
        {
            int [] frequencyCounter = new int[26];
            for(char c : strs[i].toCharArray())
            {
                frequencyCounter[c - 'a']++;
            }
            
            if(h.get(Arrays.toString(frequencyCounter)) == null)
            {
                h.put(Arrays.toString(frequencyCounter), new ArrayList<>());
                h.get(Arrays.toString(frequencyCounter)).add(strs[i]);
            }
            else
            {
                h.get(Arrays.toString(frequencyCounter)).add(strs[i]);
            }
        }

        return new ArrayList<>(h.values());
    }
}
