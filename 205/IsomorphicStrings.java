public class IsomorphicStrings {
    
    public boolean isIsomorphic(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        for (int i = 0; i < ss.length; i++) {
            if (!map.containsKey(ss[i])) {
                if (!map.containsValue(tt[i])) {
                    map.put(ss[i], tt[i]);
                }
                else {
                    return false;
                }
            }
            else {
                if (map.get(ss[i]) != tt[i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
}