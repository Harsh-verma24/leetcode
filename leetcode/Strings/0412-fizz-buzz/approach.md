# 0412. Fizz Buzz

## 📌 Problem Overview
- **Difficulty:** 🟩 Easy
- **Topics:** Math, String, Simulation
- **LeetCode Link:** [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)

---

## 💡 Solution Overview & Intuition
The solution addresses **Fizz Buzz** using an **Iterative Traversal / Direct Simulation** approach.

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
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i =1; i<=n;i++){
            if(i%3 == 0 && i%5== 0 ){
                res.add("FizzBuzz");
            }
            else if(i%3 == 0 ){
                res.add("Fizz");
            }
            else if(i%5== 0 ){
                res.add("Buzz");
            }
            else{
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
```
