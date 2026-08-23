# 3622. Check Divisibility by Digit Sum and Product

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Math
- **LeetCode Link:** [Check Divisibility by Digit Sum and Product](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Check Divisibility by Digit Sum and Product** using an **Iterative Traversal / Direct Simulation** approach.

### Key Highlights:
- **Primary Pattern:** Iterative Traversal / Direct Simulation
- **Data Structures Used:** Primitive Variables / Arrays
- **Programming Language:** java

## 🛠️ Step-by-Step Algorithm Walkthrough
1. **Input Processing:** Read and sanitize input parameters.
2. **Sequential Traversal:** Iterate through elements to execute target transformation or calculation.
3. **Final Result:** Construct and return expected output value.

## ⏱️ Complexity Analysis
- **Time Complexity:** $\mathcal{O(N)}$ — Single loop or linear traversal over the input elements.
- **Space Complexity:** $\mathcal{O(1)}$ — Only constant auxiliary memory is used for variables.

---

## 💻 Complete Solution Code

```java
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
```
