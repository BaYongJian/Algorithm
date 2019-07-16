import java.util.*;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        // (数组的值，出现次数)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                //如果key重复的话，hashmap会自动覆盖key一样的数据，保证一个key对应一个value
                map.put(array[i], map.get(array[i]) + 1);
            }
            if (map.get(array[i]) > array.length / 2){
                return array[i];
            }
        }
        return 0;
    }
}
