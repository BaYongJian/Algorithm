class Solution {
    public int removeElement(int[] nums, int val) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            if(nums[low] == val){
                nums[low] = nums[high];
                high--;
            }else{
                low++;
            }
        }
        return low;
    }
}
