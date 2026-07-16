class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<String, Integer>, List<String>> h = new HashMap<HashMap<String, Integer>, List<String>>();

        for(int i =0; i < strs.length; i++)
        {
            HashMap<String, Integer> frequency = new HashMap<String, Integer>();
            for(int j = 0; j < strs[i].length(); j++)
            {
                if(frequency.get(strs[i].substring(j, j + 1)) == null)
                {
                    frequency.put(strs[i].substring(j, j + 1), 1);
                }
                else
                {
                   frequency.put(strs[i].substring(j, j + 1), frequency.get(strs[i].substring(j, j + 1)) + 1); 
                }
            }
            h.putIfAbsent(frequency, new ArrayList<>());
            h.get(frequency).add(strs[i]);
        }

        return new ArrayList<>(h.values());
    }
}
