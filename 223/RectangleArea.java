public class RectangleArea {
    
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int intersection = 1;
        
        intersection *= (A < E) ? helper(A, C, E, G) : helper(E, G, A, C);
        intersection *= (B < F) ? helper(B, D, F, H) : helper(F, H, B, D);
        
        return area(A, C, B, D) + area(E, G, F, H) - intersection;
    }
    
    private int helper(int I, int J, int K, int L) {
        return (J < K) ? 0 : Math.min(J, L) - K;
    }
    
    private int area(int I, int J, int K, int L) {
        return (J - I) * (L - K);
    }
    
}