class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();

        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                open.push(s.charAt(i));
            }
            else if(open.isEmpty())
            {
                return false;
            }
            else if(s.charAt(i) == brackets.get(open.peek()))
            {
                open.pop();
            }
            else{
                return false;
            }
        }

        return open.isEmpty();
    }
}
