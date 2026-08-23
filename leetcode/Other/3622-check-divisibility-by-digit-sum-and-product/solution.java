class Solution {
    public boolean checkDivisibility(int n) {
        int dup =n ;
        int digitSum = 0;
        int digitProduct = 1;
        while(dup>0){
            int lastDigit = dup%10;
            digitSum = lastDigit + digitSum;
            digitProduct = lastDigit * digitProduct;
            dup=dup/10;
        }
        int divisor = digitSum + digitProduct;

        return divisor % n == 0;
    }
}