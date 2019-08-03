class Solution {
    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0;i < A.length;i++){
            B[i] = A[i] * A[i];
        }
        Arrays.sort(B);
        return B;
    }
}
