# 0026. Remove Duplicates from Sorted Array

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Array, Two Pointers
- **LeetCode Link:** [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Remove Duplicates from Sorted Array** using an **Iterative Traversal / Direct Simulation** approach.

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
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]= nums[j];
                j++;
            }
        }
        return i+1;
    }
}
```
