public class NumberOf1Bits {
    
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        long m = n & 0xFFFFFFFFL;
        
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((m & (1 << i)) > 0) count++;
        }
        
        return count;
    }
    
}