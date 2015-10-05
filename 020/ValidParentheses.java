public class ValidParentheses {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (!stack.isEmpty()) {
                    if      (c == ')' && stack.peek() == '(') stack.pop();
                    else if (c == '}' && stack.peek() == '{') stack.pop();
                    else if (c == ']' && stack.peek() == '[') stack.pop();
                    else                                      return false;
                }
                else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
}