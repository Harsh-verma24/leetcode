# 0001. Two Sum

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Array, Hash Table
- **LeetCode Link:** [Two Sum](https://leetcode.com/problems/two-sum/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Two Sum** using an **Iterative Traversal / Direct Simulation** approach.

### Key Highlights:
- **Primary Pattern:** Iterative Traversal / Direct Simulation
- **Data Structures Used:** Primitive Variables / Arrays
- **Programming Language:** java

## 🛠️ Step-by-Step Algorithm Walkthrough
1. **Input Processing:** Read and sanitize input parameters.
2. **Sequential Traversal:** Iterate through elements to execute target transformation or calculation.
3. **Final Result:** Construct and return expected output value.

## ⏱️ Complexity Analysis
- **Time Complexity:** $\mathcal{O(N²)}$ — Contains nested loops iterating over the input collection.
- **Space Complexity:** $\mathcal{O(1)}$ — Only constant auxiliary memory is used for variables.

---

## 💻 Complete Solution Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i =0 ; i<n ;i++){
            for(int j=i+1; j<n ; j++){
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }
}
```
