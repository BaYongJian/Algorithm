import java.util.*;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0) return -1;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0;i < n;i++){
            list.add(i);
        }
        int out = 0;
        while(list.size() > 1){
            out = (out + m - 1) % list.size();
            list.remove(out);
        }
        return list.get(0);
    }
}
