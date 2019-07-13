public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array.length==0||array[0].length==0||target<array[0][0] ||target>array[array.length-1][array[0].length-1]){
            return false;
        }
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array[i].length;j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
