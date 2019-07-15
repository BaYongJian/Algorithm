public class Solution {
    public void reOrderArray(int [] array) {
        if (array != null) {
            int[] even = new int[array.length];
            int indexOdd = 0;
            int indexEven = 0;
            for (int num : array) {
                if ((num & 1) == 1) {
                    array[indexOdd++] = num;
                } else {
                    even[indexEven++] = num;
                }
            }
 
            for (int i = 0; i < indexEven; i++) {
                array[indexOdd + i] = even[i];
            }
        }
    }
}
