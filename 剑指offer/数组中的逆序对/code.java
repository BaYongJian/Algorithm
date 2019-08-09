public class Solution {
    long num = 0;
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0) return -1;
        if(array.length == 1) return 1;
        mergeSortCounting(array,0,array.length - 1);
        return (int)num%1000000007;
    }
    
    public void mergeSortCounting(int[] array,int start,int end){
        if(start >= end) return;
        int mid = (end + start) >> 1;
        mergeSortCounting(array,start,mid);
        mergeSortCounting(array,mid + 1,end);
        merge(array,start,mid,end);
    }
    
    public void merge(int[] array,int start,int mid,int end){
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[end - start + 1];
        while(i <= mid && j <= end){
            if(array[i] < array[j]){
                temp[k++] = array[i++];
            }else{
                num = (num + mid - i + 1) % 1000000007;
                temp[k++] = array[j++];
            }
        }
        while(i <= mid){//start = mid时，array[mid]还未处理
            temp[k++] = array[i++];
        }
        while(j <= end){
            temp[k++] = array[j++];
        }
        for(int x = 0;x <= end - start;++x){
            array[start + x] = temp[x];
        }
    }
}
