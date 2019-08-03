class Solution {
    public int[] sortedSquares(int[] A) {
        int index1 = 0;
        int index2 = 0;
        while(index1 < A.length && A[index1] < 0){
            index1++;
        }
        index2 = index1 - 1;
        int a = 0;
        int[] B = new int[A.length];
        while(index1 < A.length && index2 > -1){
            if(Math.abs(A[index2]) > A[index1]){
                B[a] = A[index1] * A[index1];
                index1++;
                a++;
            }else{
                B[a] = A[index2] * A[index2];
                index2--;
                a++;
            }
        }
        while(index1 < A.length){
            B[a++] = A[index1] * A[index1];
            index1++;
        }
        while(index2 > -1){
            B[a++] = A[index2] * A[index2];
            index2--;
        }
        return B;
    }
}
