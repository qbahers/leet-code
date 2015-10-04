public class ZigZagConversion {
    
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        StringBuilder ss = new StringBuilder();
        
        for (int i = 0; i < numRows; i++)
            for (int j = 0; j < s.length(); j++)
                if (j % (2 * numRows - 2) == i || j % (2 * numRows - 2) == (2 * numRows - 2) - i)
                    ss.append(s.charAt(j));
        
        return new String(ss);
    }
    
}