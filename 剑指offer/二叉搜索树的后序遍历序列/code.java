public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        if(sequence.length == 1) return true;
        return Compare(sequence,0,sequence.length - 1);
    }
    
    //start、end为下标
    public boolean Compare(int[] nums,int start,int end){
        if(start >= end) return true;//start==end对应的是叶子结点，start>end对应的是空树
        int temp = start;
        while(nums[temp] < nums[end]){
            temp++;
        }
        for(int i = temp;i < end;i++){
            if(nums[i] < nums[end]) return false;
        }
        return Compare(nums,start,temp - 1) && Compare(nums,temp,end - 1);
    }
}
