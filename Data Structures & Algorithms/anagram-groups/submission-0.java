class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List x;
            if(map.containsKey(key))
                x = map.get(key);
            else {
                x = new ArrayList<>();
                map.put(key, x);
            }
            x.add(s);
        }
        return new ArrayList<>(map.values());
    }
}
