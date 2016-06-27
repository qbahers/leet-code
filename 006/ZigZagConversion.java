/**
 * Time:  O(n)
 * Space: O(n)
 */

public class ZigZagConversion {
    
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        int N = s.length();
        int step = 2 * numRows - 2;
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < numRows; i++) {
            int j = 0;
            while (j < N) {
                if (j + i < N) {
                    res.append(s.charAt(j + i));
                }
                if (j + step - i < N && i != 0 && i != numRows - 1) {
                    res.append(s.charAt(j + step - i));
                }
                j += step;
            }
        }
        
        return res.toString();
    }
    
}