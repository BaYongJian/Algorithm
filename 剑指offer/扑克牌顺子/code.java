import java.util.*;
public class Solution {
    public boolean isContinuous(int [] nums) {
        if(nums.length < 5) return false;
        int ZeroTimes = 0;
        int Interval = 0;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] == 0){
                ZeroTimes++;
                continue;
            }
            if(nums[i] == nums[i + 1]) return false;
            Interval += nums[i + 1] - nums[i] - 1;
        }
        if(ZeroTimes < Interval) return false;
        return true;
    }
}
