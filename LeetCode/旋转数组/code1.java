class Solution {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];//创建长度一样的数组
        for(int i=0;i<nums.length;i++)
        {
            a[(i + k) % nums.length] = nums[i]; //把数组中的元素放到正确位置,这一步是最主要的！！！
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = a[i];
        }
    }
}
