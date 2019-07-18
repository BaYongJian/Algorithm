class Solution {
    public boolean containsDuplicate(int[] nums) {
        // (数组的值，出现次数)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
