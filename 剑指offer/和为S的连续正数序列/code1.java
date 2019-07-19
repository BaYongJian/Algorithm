import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int low = 1;
        int high = 2;
        while(low < high){
            int landh = (low + high) * (high - low + 1) / 2;
            if(landh == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = low; i < high + 1;i++){
                    list.add(i);
                }
                result.add(list);
                high++;
            }else if(landh < sum){
                high++;
            }else{
                low++;
            }
        }
        return result;
    }
}
