class Solution {
    public boolean checkDivisibility(int n) {
        int original =n ;
        int digitSum = 0;
        int digitProduct = 1;
        while(n >0){
            int lastDigit = n%10;
            n = n/10;
            digitSum += lastDigit;
            digitProduct *= lastDigit ;
        }
        return original % (digitSum + digitProduct) == 0;
    }
}