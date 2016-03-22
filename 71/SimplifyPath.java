public class SimplifyPath {
    
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        
        for (String s : path.split("/")) {
            if (s.equals("") || s.equals(".")) {
                continue;
            }
            else if (s.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(s);
            }
        }
        
        StringBuilder res = new StringBuilder();
        for (String s : stack) {
            res.append("/");
            res.append(s);
        }
        
        return stack.empty() ? "/" : res.toString();
    }
    
}