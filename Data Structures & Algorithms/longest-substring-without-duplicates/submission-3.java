class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        int len = 0;
        int maxLen = 0;
        for (int i = 0 ; i < s.length(); i++){
            char curr = s.charAt(i);
            if (map.containsKey(curr)){
                maxLen = Math.max(maxLen,len);
                len = Math.min (len, i - map.get(curr) - 1);
            }
            map.put(curr,i);
            len++;
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
        
    }
}
