/**
 * Time:  O(4^n)
 * Space: O(4^n)
 */

public class LetterCombinationsOfAPhoneNumber {
    
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.isEmpty()) return res;
        res.add("");
        
        String[] mapping = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        for (char digit : digits.toCharArray()) {
            List<String> tmp = new ArrayList<String>();
            
            for (String combination : res) {
                for (char letter : mapping[digit - '0'].toCharArray()) {
                    tmp.add(combination + letter);
                }
            }
            
            res = tmp;
        }
        
        return res;
    }
    
}