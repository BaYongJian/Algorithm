import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null||array.length == 0) return 0;
        Arrays.sort(array);
        return array[0];
    }
}
