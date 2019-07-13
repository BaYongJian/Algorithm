class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || (nums != null && nums.length == 0)) return -1;
        if(nums[0] == target) return 0;
        int x = min(nums);
        //查找左边
        int a = Binary(nums,target,0,x - 1);
        //查找右边
        int b = Binary(nums,target,x,nums.length - 1);
        if(a == b && a== 0){
            return -1;
        }else{
            return a + b;
        }
    }
    
    //二分查找
    private int Binary(int[] num,int x,int low,int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(num[mid] < x) {
                low = mid + 1;
            }else if(num[mid] > x){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return 0;
    }
    
    //返回临界点的下标
    private int min(int[] num) {
        int low = 0;
        int high = num.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(num[mid] > num[high]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return low;
    }
}
