public class WordPattern {
    
    public boolean wordPattern(String pattern, String str) {
        char[] p = pattern.toCharArray();
        String[] s = str.split(" ");
        
        if (p.length != s.length) return false;
        
        Map<Character, String> map = new HashMap<Character, String>();
        
        for (int i = 0; i < p.length; i++) {
            if (map.containsKey(p[i])) {
                if (!map.get(p[i]).equals(s[i])) {
                    return false;
                }
            }
            else {
                if (map.containsValue(s[i])) {
                    return false;
                }
                else {
                    map.put(p[i], s[i]);
                }
            }
        }
        
        return true;
    }
    
}