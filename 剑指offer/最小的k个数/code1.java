//采用冒泡排序
import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(input.length < k) return  list;
        for(int i = 0;i < input.length;i++){
            for(int j = 0;j < input.length - i - 1;j++){
                if(input[j] > input[j + 1]){
                    int a = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = a;
                }
            }
        }
        for(int x = 0;x < k;x++){
            list.add(input[x]);
        }
        return list;
    }
}

//采用插入排序
import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(input.length < k) return list;
        insertionSort(input,input.length);
        for(int x = 0;x < k;x++){
            list.add(input[x]);
        }
        return list;
    }
    
    public void insertionSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            //查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j]; //数据移动
                } else {
                    break;
                }
            }
        a[j+1] = value; //插入数据
        }
    }
}
