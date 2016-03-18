public class LargestNumber {
    
    public String largestNumber(int[] nums) {
        int N = nums.length;
        
        String[] a = new String[N];
        for (int i = 0; i < N; i++) {
            a[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -(s1 + s2).compareTo(s2 + s1);
            }
        });
        
        StringBuilder res = new StringBuilder();
        for (String s : a) {
            res.append(s);
        }
        
        return (res.charAt(0) == '0') ? "0" : res.toString();
    }
    
}