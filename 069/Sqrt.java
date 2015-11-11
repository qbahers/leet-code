public class Sqrt {
    
    public int mySqrt(int x) {
        if (x < 0) return x;
        
        int lo = 0;
        int hi = x / 2 + 1;
        
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if      (mid * mid < x) lo = (int) mid + 1;
            else if (mid * mid > x) hi = (int) mid - 1;
            else return (int) mid;
        }
        
        return hi;
    }
    
}