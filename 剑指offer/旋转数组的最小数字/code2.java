public class Solution {
    public static int minNumberInRotateArray(int [] array) {
        if(array == null||array.length == 0) return 0;
        int num = -1;
        for(int i = 0;i < array.length;i++){
            for(int j = 1;j < array.length - 1;j++){
                if(array[j] >= 0 && array[i] > array[j]){
                    num = array[j];
                    array[i] = -1;
                }else{
                    array[j] = -1;  
                }
            }
        }
        return num;
    }
}
