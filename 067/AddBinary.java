public class AddBinary {
    
    public String addBinary(String a, String b) {
        int M = a.length();
        int N = b.length();
        
        int k = 0;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        
        while (k < Math.max(M, N) || carry > 0) {
            int digit = carry;
            if (k < M) digit += a.charAt(M - 1 - k) - '0';
            if (k < N) digit += b.charAt(N - 1 - k) - '0';
            
            res.insert(0, digit % 2);
            
            carry = digit / 2;
            k++;
        }
        
        return new String(res);
    }
    
}