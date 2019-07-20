class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int i = 0;
        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            if(set1.contains(x)) 
                set2.add(x);
        }
        int[] num = new int[set2.size()];
        Iterator it = set2.iterator();
        while(it.hasNext()) {
            num[i++] = (int) it.next();
        }
        return num;
    }
}
