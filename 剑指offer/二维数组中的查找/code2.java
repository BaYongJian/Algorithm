public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array.length==0||array[0].length==0||target<array[0][0] ||target>array[array.length-1][array[0].length-1]){
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        while(row < array.length && col > -1){
            if(array[row][col] == target){
                return true;
            }else if(array[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
