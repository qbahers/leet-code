public class LetterCombinationsOfAPhoneNumber {
    
    public List<String> letterCombinations(String digits) {
        
        List<String> combinations = new ArrayList<String>();
        
        if (digits.isEmpty()) return combinations;
        
        String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        combinations.add("");
        
        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            String letters = mapping[digit];
            
            List<String> list = new ArrayList<String>();
            
            for (int j = 0; j < letters.length(); j++)
                for (int k = 0; k < combinations.size(); k++)
                    list.add(combinations.get(k) + letters.charAt(j));
            
            combinations = list;
        }
        
        return combinations;
    }
    
}