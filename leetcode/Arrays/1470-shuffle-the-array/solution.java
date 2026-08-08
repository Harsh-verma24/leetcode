class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];

        int i = 0;
        int j = n;

        for(int k = 0 ; k<2*n ;k++){
            res[k++] = nums[i++];
            res[k]= nums[j++];
        }

        return res;
        
    }
}