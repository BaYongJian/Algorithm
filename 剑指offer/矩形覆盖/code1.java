public class Solution {
    public int RectCover(int target) {
        if(target == 1) return 1;
        if(target == 2) return 2;
        int fn_1 = 1,fn_2 = 2,fn = 0;
        for (int i = 3; i <= target; i++) {
            fn = fn_1+fn_2;
            fn_1 = fn_2;
            fn_2 = fn;
        }
        return fn;
    }
}
