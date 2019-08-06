public class Solution {
    public int JumpFloorII(int target) {
        int sum = 1;
        while (target-- > 1){
            sum *= 2;
        }
        return sum;
    }
}
