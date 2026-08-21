# 1929. Concatenation of Array

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Array, Simulation
- **LeetCode Link:** [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Concatenation of Array** using an **Iterative Traversal / Direct Simulation** approach.

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
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i =0 ; i< n ; i++){
            ans[i]= nums[i];
            ans[n+i]= nums[i];
        }
        return ans;
    }
}
```
