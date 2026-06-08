class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0; 
        for (int i = 0 ; i < s.length() ; i ++){
            HashSet <Character> check = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char curr = s.charAt(j);
                if (check.contains(curr)) break;
                check.add(curr);
                length = Math.max(length, check.size());
            }
        }
        return length;
        
    }
}