public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n <= 0) return 0;
        int count = 0;
        for(int i = 1;i <= n;i *= 10){
            int sum = i * 10;
            count += (n / sum) * i;
            if((n % sum) > (i * 2 - 1)) count += i;
            else if(n % sum < i) ;
            else count += n % sum - i + 1;
        }
        return count;
    }
}
