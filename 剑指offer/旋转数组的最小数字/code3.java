public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0)  return 0;
        int i = 0;
        while (i<array.length-1 ){
           if(array[i]<=array[i+1])
           {
               i++;
           }else {
               return array[i+1];
           }
        }
        return array[0];
    }
}
