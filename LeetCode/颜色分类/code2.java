class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int cur = 0;
        int blue = nums.length - 1;
        while(cur <= blue){
            if(nums[cur] == 0){
                int a = nums[red];
                nums[red] = nums[cur];
                nums[cur] = a;
                red++;
                cur++;
            }else if(nums[cur] == 2){
                int a = nums[blue];
                nums[blue] = nums[cur];
                nums[cur] = a;
                // nums[cur]是之前的nums[blue]的值，这个值是没有被扫描过的，所以不用后移，直接扫描cur。
                // cur++;
                blue--;
            }else{
                cur++;
            }
        }
    }
}
