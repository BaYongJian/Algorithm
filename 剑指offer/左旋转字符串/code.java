public class Solution {
    public String LeftRotateString(String str,int n) {
        //字符串反转三次，得到结果
        if (str == null || str.length() == 0) return "";
        char[] charArr = str.toCharArray();
        if (n > charArr.length) n = n % charArr.length;
        Reverse(charArr,0,n - 1);
        Reverse(charArr,n,charArr.length - 1);
        Reverse(charArr,0,charArr.length - 1);
        return new String(charArr);
    }
    
    public void Reverse(char[] arr,int start,int end){
        char temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
