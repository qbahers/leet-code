public class GroupAnagrams {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        for (String str : strs) {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String s = new String(a);
            
            List<String> list = new ArrayList<String>();
            if (map.containsKey(s)) list = map.get(s);
            list.add(str);
            map.put(s, list);
        }
        
        List<List<String>> res = new ArrayList<List<String>>();
        for (List<String> list : map.values()) {
            Collections.sort(list);
            res.add(list);
        }
        
        return res;
    }
    
}