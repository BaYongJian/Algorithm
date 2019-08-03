class Solution {
    public int reverse(int x) {
        long num = 0;
        long absx = Math.abs(x);
        while(absx != 0){
            long pop = absx % 10;
            absx = absx / 10;
            num = num * 10 + pop;
        }
        if(num < (1 << 31) || num > (1 << 31) - 1){
            return 0;
        }
        if(x < 0){
            return -1 * (int)num;
        }else{
            return (int)num;
        }
    }
}
