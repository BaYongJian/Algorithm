import java.util.*;
public class Solution {
    ArrayList<String> list = new ArrayList<String>();
    public ArrayList<String> Permutation(String str){
        if(str == null || str.length() == 0){
            return list;
        }
        char[] s = str.toCharArray();
        Arrays.sort(s);
        list.add(new String(s));
        int len = s.length;
        while(true){
            int left = len - 1;
            int right;
            while(left >= 1 && s[left - 1] >= s[left]){
                --left;
            }
            if(left == 0)
                break;
            right = left;
            while(right < len && s[right] > s[left - 1]){
                right++;
            }
            swap(s,left - 1,right - 1);
            reverse(s,left);
 
            list.add(new String(s));
        }
 
        return list;
    }

    private void reverse(char[] s,int k){
        if(s == null || s.length <= k)
            return;
        int len = s.length;
        for(int i = 0;i<((len - k) >> 1);++i){
            int m = k + i;
            int n = len - 1 - i;
            if(m<=n){
                swap(s,m,n);
            }
        }
    }

     private void swap(char[] s,int i,int j){
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}
