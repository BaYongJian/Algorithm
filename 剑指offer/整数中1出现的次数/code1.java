public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int sum = 0;
        for(int i = 1;i <= n;i++){
            int temp = i;
            while(temp != 0){
                if(temp % 10 == 1) sum++;
                temp = temp / 10;
            }
        }
        return sum;
    }
}
