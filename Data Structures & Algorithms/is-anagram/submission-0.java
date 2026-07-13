class Solution {
    public boolean isAnagram(String s, String t) {
      char [] chars1 = s.toCharArray();
      char [] chars2 = t.toCharArray();

      Arrays.sort(chars1);
      Arrays.sort(chars2);

      String alphaS = new String(chars1);
      String alphaT = new String(chars2);

      System.out.println(alphaS);
      System.out.println(alphaT);

      if(alphaS.equals(alphaT)) 
      {
        return true;
      } 
      return false;
    }
}
