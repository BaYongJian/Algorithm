import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer>list = new ArrayList<>();
        if(num == null || num.length < size || size < 1) return list;
        Deque<Integer>deque = new LinkedList<>();//存储索引
        //第一个窗口少最后一个元素
        for(int i = 0;i < size - 1;i++){
            while(!deque.isEmpty() && num[i] > num[deque.getLast()]){
                deque.pollLast();
            }
            deque.add(i);
        }
        //剩下的窗口
        for(int i = size - 1;i < num.length;i++){
            while(!deque.isEmpty() && num[i] > num[deque.getLast()]){
                deque.pollLast();
            }
            deque.add(i);
            if(deque.getFirst() < (i - size + 1)){
                deque.pollFirst();
            }
            list.add(num[deque.peekFirst()]);
        }
        return list;
    }
}
