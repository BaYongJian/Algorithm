class Solution {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        int b = nums.length - 1;
        while(a <= b){
            if(nums[a] != val){
                a++;
            }else{
                if(nums[b] != val){
                    int x = nums[b];
                    nums[b] = nums[a];
                    nums[a] = x;
                    b--;
                }else{
                    while(nums[b] == val && b > a + 1){
                        b--;
                    }
                    int x = nums[b];
                    nums[b] = nums[a];
                    nums[a] = x;
                    b--;
                }
            }
        }
        return a;
    }
}
