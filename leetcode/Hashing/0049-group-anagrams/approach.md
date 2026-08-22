# 0049. Group Anagrams

## 📌 Problem Overview
- **Difficulty:** 🟨 Medium
- **Topics:** Array, Hash Table, String, Sorting
- **LeetCode Link:** [Group Anagrams](https://leetcode.com/problems/group-anagrams/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Group Anagrams** using an **Sorting** approach.

### Key Highlights:
- **Primary Pattern:** Sorting
- **Data Structures Used:** Hash Table / Map / Set
- **Programming Language:** java

## 🛠️ Step-by-Step Algorithm Walkthrough
1. **Initialize Hash Container:** Instantiate a hash table or set to achieve fast $O(1)$ lookups.
2. **Single Pass Traversal:** Iterate through the elements while querying or recording state in the map.
3. **Instant Lookup:** Check complement/frequency in constant time to determine matching answers.

## ⏱️ Complexity Analysis
- **Time Complexity:** $\mathcal{O(N log N)}$ — Dominant operation is sorting the input elements.
- **Space Complexity:** $\mathcal{O(N)}$ — Uses auxiliary data structure (Map/Set/Queue/Heap) storing up to N elements.

---

## 💻 Complete Solution Code

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
```
