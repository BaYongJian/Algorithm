class Solution {
     public int subarraySum(int[] nums, int k) {
        //(连续子数组和，出现次数) 
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);// k - k == 0，即从首元素加到当前元素时，和刚好为k
        int sum = 0;
        int result = 0;
        for (int num : nums) {
            sum += num;
            // 检查是否存在 sum[j] + k == sum[i]，即sum[j,i] = k
            int pSum = sum - k;
            if (map.containsKey(pSum)) {
                result += map.get(pSum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
