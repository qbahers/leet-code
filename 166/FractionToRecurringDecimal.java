public class FractionToRecurringDecimal {
    
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        
        String res = ((numerator < 0) ^ (denominator < 0)) ? "-" : "";
        
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        
        while (!map.containsKey(num)) {
            long quotient = num / den;
            long remainder = num % den;
            
            res += quotient;
            
            if (remainder == 0) return res;
            if (map.size() == 0) res += ".";
            
            map.put(num, res.length() - 1);
            num = remainder * 10;
        }
        
        return res.substring(0, map.get(num)) + "(" + res.substring(map.get(num)) + ")";
    }
    
}