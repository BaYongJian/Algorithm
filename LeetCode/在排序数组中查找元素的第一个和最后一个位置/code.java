class Solution {
	public  int[] searchRange(int[] nums, int target) {
		int[] arr = { -1, -1 };
		int index = BinarySearch(nums, target);
		if (index == -1) {
			return arr;
		}
		int l = index - 1;
		while (l >= 0 && nums[l] == target) {
			--l;
		}
		arr[0] = l + 1;
		int r = index + 1;
		while (r < nums.length && nums[r] == target) {
			++r;
		}
		arr[1] = r - 1;
 
		return arr;
	}
    
    public  int BinarySearch(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low +((high -low)>>1);
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
