class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
		// 无须操作
		if (k == 0 || k == length || length == 1) {
			return;
		}
		// 修正 k
		if (k > length) {
			k %= length;
		}
		// 从 length - 1 开始操作
		int indexLimit = length - 1;
		int curIndex = indexLimit;
		int lastIndex = indexLimit;
		int lastValue = nums[indexLimit];
		int count = 0;
		while (count++ < length) {
			curIndex += k;
			// 修正 curIndex
			if (curIndex > indexLimit) {
				curIndex -= length;
			}
			int tmp = nums[curIndex];
			nums[curIndex] = lastValue;
			lastValue = tmp;
			if (curIndex == lastIndex) {
				// 一次完整的迭代交换后
				// 需要重置索引和 lastValue
				curIndex = --lastIndex;
				lastValue = nums[curIndex];
			}
        }
    }
}
