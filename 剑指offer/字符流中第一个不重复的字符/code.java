import java.util.*;
public class Solution {
    //Insert one char from stringstream
    ArrayList<Character> list = new ArrayList<>();
    HashMap<Character,Integer> map = new HashMap<>();
    public void Insert(char ch){
        map.put(ch,map.getOrDefault(ch,0) + 1);
        list.add(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
        for(char x : list){
            if(map.get(x) == 1) return x;
        }
        return '#';
    }
}
