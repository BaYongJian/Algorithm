public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int num = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] == k){
                num++;
            }
        }
        return num;
    }
}
