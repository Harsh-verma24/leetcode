class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.lenght != t.length){
            return false;
        }

        HashMap<Integer,Integer> countS = new HashMap<>();
        HashMap<Integer,Integer> countT = new HashMap<>();

        for(char c : s.toCharArray()){
            countS.put(c , countS.getOrDefault(c,0)+1);
        }
         for(char c : t.toCharArray()){
