public class Solution {
    public int JumpFloorII(int target) {
        if(target == 1) return 1;
        if(target == 2) return 2;
        return JumpFloorII(target - 1) * 2;
    }
}
