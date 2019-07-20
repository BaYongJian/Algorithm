public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int[] word = new int[100];
        for(int i = 0;i < str.length();i++){
            word[str.charAt(i) - 'A']++;
        }
        for(int i = 0; i < str.length();i++){
            if(word[str.charAt(i) - 'A'] == 1) return i;
        }
        return -1;
    }
}
