public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String str = "";
        if(numbers == null || numbers.length == 0) return str; 
        for(int i = 0;i < numbers.length;++i){
            for(int j = i + 1;j < numbers.length;++j){
                long tmp1 = Long.valueOf(numbers[i] +""+ numbers[j]);//首先转为字符串拼接，然后再将字符串转为数值。
                long tmp2 = Long.valueOf(numbers[j] +""+ numbers[i]);
                if(tmp1 > tmp2){
                    int tmp =numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        for(int x : numbers){
            str += x;
        }
        return str;
    }
}
