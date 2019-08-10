import java.util.*;
public class Solution {

    //小顶堆
    private PriorityQueue<Integer> minHeap = new PriorityQueue();
    //大顶堆
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
    int count = 0;
    public void Insert(Integer num) {
        if(count % 2 == 0){
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }else{
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        ++count;
    }

    public Double GetMedian() {
        if(count % 2 == 0){
            return new Double((maxHeap.peek() + minHeap.peek()) / 2.0);
        }else{
            return new Double(minHeap.peek());
        }
    }
}
