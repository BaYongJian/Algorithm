public class Solution {
    public String ReverseSentence(String sr) {
        if(sr == null || sr.trim().equals("")) return sr;
        char[]str = sr.trim().toCharArray();
        Reverse(str,0,str.length - 1);
        int low = 0;
        int high = 0;
        while(low != str.length){
            if(str[low] == ' '){
                low++;
                high++;
            }else if(str[high] == ' '){
                Reverse(str,low,high - 1);//注意：翻转时，空格不动
                ++high;
                low = high;
            }else if(high == str.length- 1){
                Reverse(str,low,high);
                ++high;
                low = high;
            }else{
                high++;
            }
        }
        return String.valueOf(str);
    }
    
    public void Reverse(char[] str,int start,int end){
        while(start <= end){
            char tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start++;
            end--;
        }
    }
}
