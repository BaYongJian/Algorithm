class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[nums1.length];
        int a = 0;
        int b = 0;
        int c = 0;
        while(a < m && b < n){
            if(nums1[a] < nums2[b]) nums3[c++] = nums1[a++];
            else nums3[c++] = nums2[b++];
        }
        if(a == m){
            while(b < n) nums3[c++] = nums2[b++];
        }
        if(b == n){
            while(a < m) nums3[c++] = nums1[a++];
        }
        for(int i = 0;i < nums3.length;i++){
            nums1[i] = nums3[i];
        }
    }
}
