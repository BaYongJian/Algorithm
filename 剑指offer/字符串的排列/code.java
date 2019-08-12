import java.util.*;
public class Solution {
    ArrayList<String> list = new ArrayList<String>();
    public ArrayList<String> Permutation(String str){
        if(str!=null && str.length()>0){
            Permutation(str.toCharArray(),0);
            Collections.sort(list);
        }
        return list;
    }

    private void Permutation(char[] s,int start){
        if(start == s.length-1){
            if(!list.contains(new String(s)))//将重复的元素删去
            list.add(new String(s));
        }else{
            for(int i = start;i < s.length;++i){
                    swap(s,start,i);
                    Permutation(s,start + 1);
                    swap(s,start,i);
            }
        }
    }

    private void swap(char[] s,int i,int j){
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}
