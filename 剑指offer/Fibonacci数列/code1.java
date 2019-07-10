//Fibonacci数列：1、1、2、3、5、8、13、21、34、……
public class Solution {
    public int Fibonacci(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i = 3;i <= n;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
