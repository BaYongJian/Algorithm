class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(numbers == null || numbers.length == 0) return result;
        int index1 = 0;
        int index2 = numbers.length - 1;
        while(index1 < index2){
            if(numbers[index1] + numbers[index2] == target){
                result[0] = index1 + 1;
                result[1] = index2 + 1;
                return result;
            }else if(numbers[index1] + numbers[index2] > target){
                index2--;
            }else{
                index1++;
            }
        }
        return result;
    }
}
