public class RomanToInteger {
    
    public int romanToInt(String s) {
        char[] t = s.toCharArray();
        int N = t.length;
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int res = 0;
        for (int i = N - 1; i >= 0; i--) {
            int val = map.get(t[i]);
            
            if (i + 1 < N && val < map.get(t[i + 1])) {
                res -= val;
            }
            else {
                res += val;
            }
        }
        
        return res;
    }
    
}