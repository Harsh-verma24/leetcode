class Solution {
    public int maximumWealth(int[][] accounts) {
        int highestWealth = 0;
        for(int[] acc : accounts){
            int sum = 0;
            for(int w : acc){
                sum+=w;
            }
            if(sum>highestWealth){
                highestWealth=sum;
            }    
                }
                return highestWealth;
    }
}