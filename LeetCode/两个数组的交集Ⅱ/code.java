class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums1){
            map.put(x,map.getOrDefault(x, 0) + 1);
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int x : nums2){
            if(map.containsKey(x) && map.get(x) > 0){
                list.add(x);
                map.put(x, map.get(x) - 1);
            }
        }
        int len = list.size();
        int[] num = new int[len];
        for(int i = 0;i < len;i++){
            num[i] = list.poll();
        }
        //注意，上面不能写成下面这样，因为for循环中，每次都重新判断了list的长度，如果如下面这样写，则美循环一次，i自增一，list长度自减一。
        // int[] num = new int[list.size()];
        // for(int i = 0;i < list.size();i++){
        //     num[i] = list.poll();
        // }
        return num; 
    }
}
