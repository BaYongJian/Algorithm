public class Solution {
    public int JumpFloor(int target) {
        if(target <= 0) return 0;
        if(target == 1) return 1;
        if(target == 2) return 2;
        int ret = 0;
        int pre = 2;
        int prepre = 1;
        for(int i = 3; i <= target; ++i){
        ret = pre + prepre;
        prepre = pre;
        pre = ret;
        }
        return ret;
    }
}
