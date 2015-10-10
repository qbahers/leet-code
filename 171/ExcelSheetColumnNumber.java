public class ExcelSheetColumnNumber {
    
    public int titleToNumber(String s) {
        int N = s.length();
        
        int res = 0;
        for (int i = 0; i < N; i++)
            res += (s.charAt(i) - 'A' + 1) * Math.pow(26, N - 1 - i);
        
        return res;
    }
    
}