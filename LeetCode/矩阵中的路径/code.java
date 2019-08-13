public class Solution {
    public boolean hasPath(char[] mx, int rows, int cols, char[] str){
        if(mx == null || mx.length == 0
           || mx.length < rows * cols
           || str == null || str.length == 0
           || mx.length < str.length)
            return false;
        int[] flag = new int[mx.length];
        for(int i = 0;i < rows;++i){
            for(int j = 0;j < cols;++j){
               if(mx[i * cols + j] == str[0] && FindPath(mx,rows,cols,i,j,0,str,flag)){//因为mx数组中有重复元素，所以不能直接返回FindPath。
                   return true;
               }
            }
        }
        return false;
    }

    public boolean FindPath(char[] mx,int rows,int cols,int i,int j,int k,char[] str,int[] flag){
        if(i < 0 || i >= rows
           || j < 0 || j >= cols
           || flag[i * cols + j] == 1
           || mx[i * cols + j] != str[k])
            return false;
        if(k == str.length - 1) return true;
        flag[i * cols + j] = 1;
        if(FindPath(mx,rows,cols,i + 1,j,k + 1,str,flag)
          || FindPath(mx,rows,cols,i - 1,j,k + 1,str,flag)
          || FindPath(mx,rows,cols,i,j + 1,k + 1,str,flag)
          || FindPath(mx,rows,cols,i,j - 1,k + 1,str,flag))
            return true;
        flag[i * cols + j] = 0;//如果这一语句被执行，说明前一步走的不对，所以要回退一步
        return false;
    }
}
