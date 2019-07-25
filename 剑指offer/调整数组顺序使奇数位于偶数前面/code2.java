//从后往前
public class Solution {
    public void reOrderArray(int [] array) {
        for (int i = 0;i < array.length;i++) {
            for (int j = array.length - 1;j > i;j--) {
                if (array[j] % 2 == 1 && array[j - 1]%2 == 0) {//前偶后奇交换 
                    int a = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = a;
                }
            }
        }
    }
}

//从前往后
public class Solution {
    public void reOrderArray(int [] array) {
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array.length - 1;j++){
                if(array[j]%2 == 0 && array[j + 1]%2 == 1){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
