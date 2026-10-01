# 1480. Running Sum of 1d Array

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Array, Prefix Sum
- **LeetCode Link:** [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Running Sum of 1d Array** using an **Iterative Traversal / Direct Simulation** approach.

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
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            res[i] = res [i-1] + nums[i];
        }
        return res;
    }
}
```
