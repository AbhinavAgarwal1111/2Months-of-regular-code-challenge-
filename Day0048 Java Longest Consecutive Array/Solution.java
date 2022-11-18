class Solution {
        
        public int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int num: nums) set.add(num);
 
    int result = 0;
 
    for(int num: nums){
        int count = 1;
 
        int down = num-1;
        while(set.contains(down)){
            set.remove(down);
            down--;
            count++;
        }
 
        int up = num+1;
        while(set.contains(up)){
            set.remove(up);
            up++;
            count++;
        }
 
        result = Math.max(result, count);
    }
 
    return result;
}}