public class RestoreIpAddresses {
    
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        
        for (int i = 1; i <= 3; i++) {
            for (int j = i + 1; j <= i + 3; j++) {
                for (int k = j + 1; k <= j + 3; k++) {
                    for (int l = k + 1; l <= k + 3; l++) {
                        if (l != s.length()) continue;
                        
                        String s1 = s.substring(0, i);
                        String s2 = s.substring(i, j);
                        String s3 = s.substring(j, k);
                        String s4 = s.substring(k, l);
                        
                        if (!isValid(s1) || !isValid(s2) || !isValid(s3) || !isValid(s4)) continue;
                        
                        res.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        
        return res;
    }
    
    private boolean isValid(String s) {
        if (s.charAt(0) == '0' && s.length() > 1) return false;
        
        return Integer.parseInt(s) <= 255;
    }
    
}