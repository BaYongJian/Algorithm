class Solution {
    public int[][] flipAndInvertImage(int[][] a) {
        if(a == null || a.length == 0) return a;
        for(int i = 0;i < a.length;i++){
            int low = 0;
            int high = a[i].length - 1;
            while(low <= high){
                if(a[i][low] == a[i][high]){
                    if(a[i][low] == 0){
                        a[i][low] = 1;
                        a[i][high] = 1;
                    }else{
                        a[i][low] = 0;
                        a[i][high] = 0;
                    }
                }
                low++;
                high--;
            }
        }
        return a;
    }
}
