/**
 * Time:  O(4^n / n^(3/2)) (Catalan numbers)
 * Space: O(4^n / n^(3/2))
 */

public class GenerateParentheses {
    
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generateParenthesis(res, "", n, n);
        return res;
    }
    
    private void generateParenthesis(List<String> res, String s, int n, int m) {
        if (n == 0 && m == 0) res.add(s);
        if (n > 0)            generateParenthesis(res, s + "(", n - 1, m);
        if (m > n)            generateParenthesis(res, s + ")", n, m - 1);
    }
    
}