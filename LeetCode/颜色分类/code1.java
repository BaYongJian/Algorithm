class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 0){
                a++;
            }else if(nums[i] == 1){
                b++;
            }else{
                c++;
            }
        }
        for(int i = 0;i < a;i++){
            nums[i] = 0;
        }        
        for(int i = 0;i < b;i++){
            nums[a + i] = 1;
        }        
        for(int i = 0;i < c;i++){
            nums[a + b + i] = 2;
        }        
    }
}
