public class Solution {
     public int FindGreatestSumOfSubArray(int[] array) {
         if (array == null || array.length == 0) return -1;
         int MaxSum = Integer.MIN_VALUE;
         int CurSum = 0;
         for (int x : array) {
             if (CurSum <= 0) {
                 CurSum = x; //记录当前最大值
             }else {
                 CurSum += x; 
             }
             if (CurSum > MaxSum) {
                 MaxSum = CurSum; 
             }
         }
         return MaxSum;
     }
}
