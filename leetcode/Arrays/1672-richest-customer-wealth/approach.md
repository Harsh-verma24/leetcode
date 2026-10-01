# 1672. Richest Customer Wealth

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Array, Matrix
- **LeetCode Link:** [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Richest Customer Wealth** using an **Iterative Traversal / Direct Simulation** approach.

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
```
