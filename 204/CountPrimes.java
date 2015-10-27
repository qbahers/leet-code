public class CountPrimes {
    
    public int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, 2, n + 1, true);
        
        int i = 2;
        while (i * i <= n) {
            if (sieve[i]) {
                int k = i * i;
                while (k <= n) {
                    sieve[k] = false;
                    k += i;
                }
            }
            i++;
        }
        
        int count = 0;
        for (int j = 0; j < n; j++)
            if (sieve[j])
                count++;
                
        return count;
    }
    
}