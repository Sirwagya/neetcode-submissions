class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        List<Integer>[] buckets = new List [nums.length + 1];

        for (int i = 0 ; i < buckets.length ; i++){
            buckets[i] = new ArrayList<>();
        }

        for (int key : map.keySet()){
            int freq = map.get(key);
            buckets[freq].add(key);
        }

        int[] ans = new int [k];
        int idx = 0;

        for (int i = buckets.length-1 ; i >= 0 && idx < k ; i --){
            if (!buckets[i].isEmpty()){
                for (int num : buckets[i]) ans[idx++]= num;
            }
            if (idx == k) break;
        }
        return ans;
        
    }
}
