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
- **Data Structures Used:** Hash Table / Map / Set
- **Programming Language:** java

## 🛠️ Step-by-Step Algorithm Walkthrough
1. **Initialize Hash Container:** Instantiate a hash table or set to achieve fast $O(1)$ lookups.
2. **Single Pass Traversal:** Iterate through the elements while querying or recording state in the map.
3. **Instant Lookup:** Check complement/frequency in constant time to determine matching answers.

## ⏱️ Complexity Analysis
- **Time Complexity:** $\mathcal{O(N)}$ — Single loop or linear traversal over the input elements.
- **Space Complexity:** $\mathcal{O(N)}$ — Uses auxiliary data structure (Map/Set/Queue/Heap) storing up to N elements.

---

## 💻 Complete Solution Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> index = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i ++){
            int diff = target - nums[i];
            if(index.containsKey(diff)){
                return new int[]{i,index.get(diff)};
            }
            index.put(nums[i],i);
        }

        return new int[]{};
    }
}
```
