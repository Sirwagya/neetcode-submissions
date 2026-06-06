class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String , List<String>> map = new HashMap<>();
        for (String s : strs){
            int[] freq = new int [26];
            for (char c : s.toCharArray()) freq[c - 'a']++;
            StringBuilder k = new StringBuilder() ;
            for (int count : freq){
                k.append('*');
                k.append(count);
            }
            String hash = k.toString();
            if (!map.containsKey(hash)){
                map.put(hash,new ArrayList<>());
            }

            map.get(hash).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
