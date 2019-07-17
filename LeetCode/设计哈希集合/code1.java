class MyHashSet {

    /** Initialize your data structure here. */
    int[] nums;
    public MyHashSet() {
        nums = new int[1000000];
    }
    
    public void add(int key) {
        nums[key]++;
    }
    
    public void remove(int key) {
        nums[key] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return !(nums[key] == 0);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
