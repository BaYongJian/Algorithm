public class Solution {
    public int StrToInt(String str) {
        if(str == null || str.equals("")) return 0;
        char[] a = str.toCharArray();
        int symbol;//1正号，-1为负号
        if(a[0] == '-') symbol = -1;
        else symbol = 1;
        int sum = 0;
        for(int i = 0;i < a.length;i++){
            if(i == 0){
                if((a[0]  == '-') || (a[0] == '+')) continue;    //首位是符号
            }
            if (a[i] < 48 || a[i] > 57) return 0;    //不是阿拉伯数字
            sum = sum * 10 + a[i] - 48; //数字0的ASCII为48
        }
        return sum * symbol;
    }
}
