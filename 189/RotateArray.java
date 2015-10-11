public class RotateArray {
    
    public void rotate(int[] nums, int k) {
        int N = nums.length;
        
        int[] aux = new int[N];
        for (int i = 0; i < N; i++)
            aux[(i + k) % N] = nums[i];
            
        for (int i = 0; i < N; i++)
            nums[i] = aux[i];
            
        return;
    }
    
}