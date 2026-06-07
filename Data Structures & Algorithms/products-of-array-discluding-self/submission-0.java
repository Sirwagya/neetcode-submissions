class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int [n+1];
        int[] suffix = new int [n+1];
        
        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);

        for (int i = 1 ; i <= n; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int j = n - 1; j >= 0; j--){
            suffix[j] = suffix[j+1] * nums[j];
        }

        int[] answer = new int [n];

        for (int i = 0; i < n; i++){
            answer[i] = prefix[i] * suffix[i + 1];
        }

        return answer;
    }
}