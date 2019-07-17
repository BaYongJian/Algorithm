class MyHashSet {

    /** Initialize your data structure here. */
    List<LinkedList<Integer>> list;
    int bucketNum = 1000;
    public MyHashSet() {
        list = new ArrayList<>();
        for(int i = 0; i < bucketNum; i++){
            list.add(new LinkedList<>());
        }
    }
    
    public void add(int key) {
      //  if( !contains(key)){
            list.get(key % bucketNum).add(key);
        // }else{
        //     list.get(key % bucketNum).
        // }
    }
    
    public void remove(int key) {
        while(contains(key)){
            list.get(key % bucketNum).removeFirstOccurrence(key);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        LinkedList<Integer> bucket = list.get(key % bucketNum); 
        for( int num : bucket){
            if(num == key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
