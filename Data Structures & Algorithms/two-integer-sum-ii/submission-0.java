class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while (i < j){
            int num = nums[i] + nums[j];
            if (num == target) return new int[] {i+1,j+1};
            else if (num < target) i++;
            else j--;
        }
        return new int[] {0,0};
        
    }
}
