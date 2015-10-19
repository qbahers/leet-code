public class HappyNumber {
    
    public boolean isHappy(int n) {
        for (int i = 0; i < 1000; i++) {
            if (n == 1) return true;
            
            char[] s = Integer.toString(n).toCharArray();
            
            n = 0;
            for (char c : s)
                n += (c - '0') * (c - '0');
        }
        
        return false;
    }
    
}