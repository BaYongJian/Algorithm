class Solution {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return false;
        int x = BinaryRotate(nums);
        if(x == 0){
            return BinaryTarget(nums,target,0,nums.length - 1);
        }else{
            return BinaryTarget(nums,target,0,x - 1) || BinaryTarget(nums,target,x,nums.length - 1);
        }
    }
    
    //寻找临界点，并返回其下标
    public int BinaryRotate(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
			if(nums[low] == nums[mid] && nums[mid] == nums[high]){//特别重要，如果首、中、尾相等，则不能用二分查找！！！
                for(int i = low;i < high - 1;i++) {
                    if(nums[i] <= nums[i + 1] && nums[i + 1] > nums[i + 2]) return i + 2;
                }
            }
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else if(nums[mid] < nums[low]){
                high = mid;
            }else{
                return low;
            }
        }
        return 0;
    }
    
    //寻找target是否在nums中，若在，返回true，否则返回false。
    public boolean BinaryTarget(int[]nums,int target,int a,int b){
        int low = a;
        int high = b;
        while(low <= high){
            int mid = low+((high-low)>>1);
            if(nums[mid] > target){
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
