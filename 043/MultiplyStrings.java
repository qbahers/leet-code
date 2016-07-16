/**
 * Time:  O(m * n)
 * Space: O(m + n)
 */

public class MultiplyStrings {
    
    public String multiply(String num1, String num2) {
        int M = num1.length();
        int N = num2.length();
        
        int[] a = new int[M + N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i + j] += (num1.charAt(M - 1 - i) - '0') * (num2.charAt(N - 1 - j) - '0');
            }
        }
        
        for (int i = 0; i < M + N - 1; i++) {
            a[i + 1] += a[i] / 10;
            a[i] %= 10;
        }
        
        StringBuilder res = new StringBuilder();
        for (int i = M + N - 1; i >= 0; i--) {
            if (a[i] == 0 && res.length() == 0) continue;
            
            res.append(a[i]);
        }
        
        return (res.length() == 0) ? "0" : res.toString();
    }
    
}