public class SummaryRanges {
    
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        int N = nums.length;
        String s = "";
        int k = 0;
        
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                s = "" + nums[i];
            }
            else if ((long) nums[i] - nums[i - 1] > 1) {
                if (k > 0) res.add(s + "->" + nums[i - 1]);
                else       res.add(s);
                
                s = "" + nums[i];
                k = 0;
            }
            else {
                k++;
            }
            
            if (i == N - 1){
                if (k > 0) res.add(s + "->" + nums[i]);
                else       res.add("" + nums[i]);
            }
        }

        return res;
    }
    
}