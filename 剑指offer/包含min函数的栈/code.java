import java.util.Stack;

public class Solution {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minstack = new Stack();
    public void push(int node) {
        stack.push(node);
        if(minstack.empty() || minstack.peek() > node){
            minstack.push(node);
        }else{
            minstack.push(minstack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minstack.peek();
    }
}
