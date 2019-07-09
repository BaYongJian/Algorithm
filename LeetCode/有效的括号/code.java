/*
**栈相关
*push() 入栈
*pop() 出栈
*empty() 判断栈是否为空，为空返回true
*/
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        char[] ss = s.toCharArray();
        for(int i = 0;i < ss.length;i++){
            if(stack.isEmpty()){
                stack.push(ss[i]);
            }else if(stack.peek() == '(' && ss[i] == ')' || stack.peek() == '[' && ss[i] == ']' || stack.peek() == '{' && ss[i] == '}'){
                stack.pop();
            }else{
                stack.push(ss[i]);
            }
        }
        return stack.isEmpty();
    }
}
