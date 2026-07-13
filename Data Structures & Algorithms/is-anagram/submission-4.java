class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<String, Integer> mapS = new HashMap<String, Integer>();
        HashMap<String, Integer> mapT = new HashMap<String, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (mapS.get(s.substring(i, i + 1)) == null) {
                mapS.put(s.substring(i, i + 1), 1);
            } else {
                mapS.put(s.substring(i, i + 1), mapS.get(s.substring(i, i + 1)) + 1);
            }

            if (mapT.get(t.substring(i, i + 1)) == null) {
                mapT.put(t.substring(i, i + 1), 1);
            } else {
                mapT.put(t.substring(i, i + 1), mapT.get(t.substring(i, i + 1)) + 1);
            }
        }

        return mapS.equals(mapT);
    }
}
