public class MultiplyStrings {
    
    public String multiply(String num1, String num2) {
        int N1 = num1.length();
        int N2 = num2.length();
        
        int[] a = new int[N1 + N2];
        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < N2; j++) {
                a[i + j] += (num1.charAt(N1 - 1 - i) - '0') * (num2.charAt(N2 - 1 - j) - '0');
            }
        }
        
        for (int i = 0; i < N1 + N2 - 1; i++) {
            a[i + 1] += a[i] / 10;
            a[i] %= 10;
        }
        
        StringBuilder res = new StringBuilder();
        for (int i = N1 + N2 - 1; i >= 0; i--) {
            if (a[i] == 0 && res.length() == 0) continue;
            
            res.append(a[i]);
        }
        
        return (res.length() == 0) ? "0" : res.toString();
    }
    
}