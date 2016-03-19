public class RepeatedDNASequences {
    
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> res = new HashSet<String>();
        Set<String> set = new HashSet<String>();
        
        for (int i = 0; i + 10 <= s.length(); i++) {
            String ss = s.substring(i, i + 10);
            
            if (set.contains(ss)) {
                res.add(ss);
            }
            else {
                set.add(ss);
            }
        }
        
        return new ArrayList<String>(res);
    }
    
}