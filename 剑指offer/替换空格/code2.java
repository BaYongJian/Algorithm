public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer strbuf = new StringBuffer();
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == ' '){
                strbuf.append("%20");
            }else{
                strbuf.append(str.charAt(i));
            }
        }
        return strbuf.toString();
    }
}
