class Solution {
    public boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<>();
        HashMap<Character, Character> h = new HashMap<>();

        h.put('(', ')');
        h.put('[', ']');
        h.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                openBrackets.push(s.charAt(i));
            }
            else if (openBrackets.isEmpty()) {
                return false;
            } else if (s.charAt(i) == h.get(openBrackets.peek())) {
                openBrackets.pop();
            }
            else{
                return false;
            }
        }

        return openBrackets.isEmpty();
    }
}
