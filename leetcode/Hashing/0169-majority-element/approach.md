# 0169. Majority Element

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Array, Hash Table, Divide and Conquer, Sorting, Counting, Boyer–Moore Majority Vote Algorithm
- **LeetCode Link:** [Majority Element](https://leetcode.com/problems/majority-element/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Majority Element** using an **Iterative Traversal / Direct Simulation** approach.

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
    public int majorityElement(int[] nums) {
        int maxFreqElem = -1;
        int count = -1;
        for(int n:nums){
           if(count == -1){
            maxFreqElem = n ;
            count = 1;
           }
           else if(maxFreqElem != n){
            count--;
           }
           else{
            count++;
           }
           if(count==0){
            maxFreqElem=-1;
            count=-1;
           }
        }
        return maxFreqElem;
    }
}
```
