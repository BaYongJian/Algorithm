public class Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean SBWY = (sum != 0) && ((sum += Sum_Solution(n - 1)) != 0);
        return sum;
    }
}
