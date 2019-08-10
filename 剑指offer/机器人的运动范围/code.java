public class Solution {
    public int movingCount(int threshold, int rows, int cols){
        int[][]arr = new int[cols][rows];//此时数组元素全部是0
        return find(arr,0,0,threshold);
    }
    
    public int find(int[][]arr,int i,int j,int k){
        if(i >= arr.length || j >= arr[0].length) return 0;
        if(arr[i][j] == 1 || sum(i) + sum(j) > k) return 0;
        arr[i][j] = 1;
        return find(arr,i + 1,j,k) + find(arr,i,j + 1,k) + 1;
    }
    
    public int sum(int x){
        int i = 0;
        do{
            i += x % 10;
            x = x / 10;
        }while(x > 0);
        return i;
    }
}
