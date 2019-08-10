public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 6) return index;
        int[] a = new int[index];
        a[0] = 1;
        int b = 0;
        int c = 0;
        int d = 0;
        for(int i = 1;i < index;i++){
            a[i] = Math.min(a[b] * 2 ,Math.min(a[c] * 3,a[d] * 5));
            if(a[b] * 2 == a[i]) b++;
            if(a[c] * 3 == a[i]) c++;
            if(a[d] * 5 == a[i]) d++;
        }
        return a[index - 1];
    }
}
