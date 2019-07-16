import java.util.*;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0)
            return false;
        int popIndex = 0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0;i < pushA.length;i++){
            s.push(pushA[i]);
            while(!s.empty() && s.peek() == popA[popIndex]){
                s.pop();
                popIndex++;
            }
        }
        return s.empty();
    }
}
