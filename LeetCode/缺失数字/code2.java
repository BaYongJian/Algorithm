class Solution {
    public int missingNumber(int[] nums) {
        int num = ((nums.length + 1) * nums.length) >> 1;
        for(int i = 0;i < nums.length;i++){
            num -= nums[i];
        }
        return num;
    }
}
