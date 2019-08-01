class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int sum = 0;
        for(int x : nums){
            sum = sum ^ x;
        }
        return sum;
    }
}
