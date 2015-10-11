public class PlusOne {
    
    public int[] plusOne(int[] digits) {
        int N = digits.length;
        int remainder = 1;
        int i = N - 1;
        
        while (remainder == 1 && i >= 0) {
            if (digits[i] < 9) {
                digits[i]++;
                remainder = 0;
            }
            else {
                digits[i] = 0;
                i--;
            }
        }
        
        if (i >= 0) {
            return digits;
        }
        else {
            int[] res = new int[N + 1];
            res[0] = 1;
            
            return res;
        }
    }
    
}