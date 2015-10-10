public class ValidPalindrome {
    
    public boolean isPalindrome(String s) {
        char[] a = s.toLowerCase().toCharArray();
        int N = a.length;
        
        int i = 0;
        int j = N - 1;
        
        while (i < j) {
            while (i < j && !isAlphanumeric(a[i])) i++;
            while (i < j && !isAlphanumeric(a[j])) j--;
            
            if (a[i] == a[j]) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
    
}