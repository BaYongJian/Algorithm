public class Solution {
    public boolean isNumeric(char[] str) {
        boolean hasE = false;//是否有标志位
        boolean negative = false;//是否有负号标志位
        boolean hasdot = false;//是否有小数点标志位e
        for(int i = 0;i < str.length;i++){
            if(str[i] == 'E' || str[i] == 'e'){//当该元素是e时，此时该元素不能上末位元素，同时该元素前面不能有e
                if(i == str.length - 1)  return false;
                if(hasE) return false;
                hasE = true;
            }else if(str[i] == '+' || str[i] == '-'){//当该元素是正负号时，如果是第一次出现，只能在首位，如果是第二次出现，只能在e后面
                if(negative && str[i - 1] != 'E' && str[i - 1] != 'e') return false;
                if(!negative && i > 0 && str[i - 1] != 'E' && str[i - 1] != 'e') return false;
                negative = true;
            }else if(str[i] == '.'){//当该元素是小数点时，该元素前面不能有e，且小数点是第一次出现
                if(hasE) return false;
                if(hasdot) return false;
                hasdot = true;
            }else{//当该元素既不是e，又不是正负号，也不是小数点时，那么该元素只能是数字
                if(str[i] > '9' || str[i] < '0') return false;
            }
        }
        return true;
    }
}
