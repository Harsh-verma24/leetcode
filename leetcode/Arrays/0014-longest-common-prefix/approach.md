# 0014. Longest Common Prefix

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Array, String, Trie
- **LeetCode Link:** [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Longest Common Prefix** using an **Sorting** approach.

### Key Highlights:
- **Primary Pattern:** Sorting
- **Data Structures Used:** Primitive Variables / Arrays
- **Programming Language:** java

## 🛠️ Step-by-Step Algorithm Walkthrough
1. **Input Processing:** Read and sanitize input parameters.
2. **Sequential Traversal:** Iterate through elements to execute target transformation or calculation.
3. **Final Result:** Construct and return expected output value.

## ⏱️ Complexity Analysis
- **Time Complexity:** $\mathcal{O(N log N)}$ — Dominant operation is sorting the input elements.
- **Space Complexity:** $\mathcal{O(1)}$ — Only constant auxiliary memory is used for variables.

---

## 💻 Complete Solution Code

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length -1];
        int i = 0;

        while(i<s1.length()&& i<s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return s1.substring(0,i);
    }
}
```
