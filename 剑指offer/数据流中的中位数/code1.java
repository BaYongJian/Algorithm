import java.util.*;
public class Solution {

    ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        Collections.sort(list);
        if(list.size() % 2 == 0){
            return Double.valueOf((list.get((list.size()) >> 1) + list.get(((list.size()) >> 1) - 1)) / 2.0);
        }else {
            return Double.valueOf(list.get((list.size()) >> 1));
        }
    }
}
