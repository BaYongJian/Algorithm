import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;
        while (row != 0){
            for(int i = 0; i < matrix[0].length; i++){
                list.add(matrix[0][i]);
            }
            if(row == 1){
                break;
            }
            matrix = turn(matrix);
            row = matrix.length;
        }
        return list;
    }

    private int[][] turn(int[][] matrix){
        int col = matrix[0].length;
        int row = matrix.length;
        int[][] newMatrix = new int[col][row - 1];
        for(int j = col - 1; j >= 0; j--){
            for(int i = 1; i < row; i++){
                newMatrix[col - 1 - j][i - 1] = matrix[i][j];
            }
        }
        return newMatrix;
    }
}
