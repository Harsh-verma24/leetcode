# 0167. Two Sum II - Input Array Is Sorted

## 📌 Problem Overview
- **Difficulty:** 🟨 Medium
- **Topics:** Array, Two Pointers, Binary Search
- **LeetCode Link:** [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Two Sum II - Input Array Is Sorted** using an **Two Pointers** approach.

### Key Highlights:
- **Primary Pattern:** Two Pointers
- **Data Structures Used:** Primitive Variables / Arrays
- **Programming Language:** java

## 🛠️ Step-by-Step Algorithm Walkthrough
1. **Pointer Initialization:** Place dual pointers at key positions (e.g. start/end or slow/fast).
2. **Iterative Convergence:** Increment or decrement pointers toward each other based on comparison conditions.
3. **Optimal Selection:** Process the current elements and update answer metrics dynamically.

## ⏱️ Complexity Analysis
- **Time Complexity:** $\mathcal{O(N)}$ — Single loop or linear traversal over the input elements.
- **Space Complexity:** $\mathcal{O(1)}$ — Only constant auxiliary memory is used for variables.

---

## 💻 Complete Solution Code

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0 , j = numbers.length-1;
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
    return new int[]{};
    }
}
```
