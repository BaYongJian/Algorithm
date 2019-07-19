public class Solution {
    public double Power(double base, int exponent) {
        if(base==0){
            if(exponent==0){
                return 1;
            }
            return 0;
        }
         
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            double res = 1;
            for (int i = 0; i < -exponent; i++) {
                res *= base;
            }
            return (double)(1.0/res);
        } else {
            double res = 1;
            for (int i = 0; i < exponent; i++) {
                res *= base;
            }
            return res;
        }
    }
}
