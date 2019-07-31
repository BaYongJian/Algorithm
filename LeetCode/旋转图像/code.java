class Solution {
    public void rotate(int[][] arr) {
        if(arr == null || arr.length == 0 || arr[0].length == 0)return;
        for(int i = 0;i < arr.length;i++){
            for(int j = i;j < arr[0].length;j++){
                int temp1 = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp1;
            }
        }
        for(int i = 0;i < arr.length / 2;i++){
            for(int j = 0;j < arr[0].length;j++){
                int temp2 = arr[j][i];
                arr[j][i] = arr[j][arr.length - 1- i];
                arr[j][arr.length - 1- i] = temp2;
            }
        }
    }
}
