import java.util.*;
public class Solution {
    public String ReverseSentence(String str) {
        if(str == null || str.trim().equals("")) return str;
        Stack<String> stack = new Stack<>();
        String[] tmp = str.split(" ");
        for(String x : tmp){
            stack.push(x);
        }
        String result = stack.pop();
        while(!stack.isEmpty()){
            result += " " + stack.pop();
        }
        return result;
    }
}
