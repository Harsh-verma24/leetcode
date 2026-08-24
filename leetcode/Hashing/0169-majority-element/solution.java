class Solution {
    public int majorityElement(int[] nums) {
        int maxFreqElem = -1;
        int count = -1;
        for(int n:nums){
           if(count == -1){
            maxFreqElem = n ;
            count = 1;
           }
           else if(maxFreqElem != n){
            count--;
           }
           else{
            count++;
           }
           if(count==0){
            maxFreqElem=-1;
            count=-1;
           }
        }
        return maxFreqElem;
    }
}