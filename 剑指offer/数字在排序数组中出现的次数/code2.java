public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int a = 0;
        int b = array.length - 1;
        int num = 0;
        for(int i = 0;i < array.length;i++){
            if(array[a] < k){
                a++;
            }
            if(array[b] > k){
                b--;
            }
            num = b - a + 1;
        }
        return num;
    }
}
