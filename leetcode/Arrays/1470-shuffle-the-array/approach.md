# 1470. Shuffle the Array

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Array
- **LeetCode Link:** [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Shuffle the Array** using an **Iterative Traversal / Direct Simulation** approach.

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
```
