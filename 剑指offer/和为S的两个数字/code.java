import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
         ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length < 2) {
            return list;
        }
        int low = 0; int high = array.length - 1;
        while(low < high){
            if(array[low] + array[high] > sum){
                high --;
            }else if(array[low] + array[high] < sum){
                low ++;
            }else{
                list.add(array[low]);
                list.add(array[high]);
                return list;
            }
        }
        return list;
    }
}
