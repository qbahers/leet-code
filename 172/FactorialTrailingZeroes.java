public class FactorialTrailingZeroes {
    
    public int trailingZeroes(int n) {
        int count = 0;
        
        long k = 5;
        while (k <= n) {
            count += n / k;
            k *= 5;
        }
        
        return count;
    }
    
}