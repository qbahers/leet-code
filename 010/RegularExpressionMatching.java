class RegularExpressionMatching {
    
    public boolean isMatch(String s, String p) {
        int i = s.length() - 1;
        int j = p.length() - 1;
        
        while (i >= 0 && j >= 0) {
            if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                i--;
                j--;
            } else if (p.charAt(j) == '*') {
                j--;
                while (i >= 0 && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
                    if (isMatch(s.substring(0, i + 1), p.substring(0, j))) {
                        return true;
                    }
                    i--;
                }
                j--;
            } else {
                return false;
            }
        }
        
        while (j >= 0 && p.charAt(j) == '*') {
            j -= 2;
        }
        
        return i == -1 && j == -1;
    }
    
}