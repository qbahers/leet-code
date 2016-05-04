public class SingleNumberIII {
    
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        int k = 0;
        for (int i = 0; i < 32; i++) {
            if ((xor & (1 << i)) != 0) {
                k = i;
                break;
            }
        }
        
        int[] res = new int[2];
        for (int num : nums) {
            if ((num & (1 << k)) != 0) {
                res[0] ^= num;
            }
            else {
                res[1] ^= num;
            }
        }
        
        return res;
    }
    
}