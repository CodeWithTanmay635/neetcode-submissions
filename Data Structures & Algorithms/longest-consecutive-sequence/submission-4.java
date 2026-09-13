class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num - 1)){
            int currentLength = 1;
            while(set.contains(num + currentLength)){
            currentLength++;
            }
            count = Math.max(count,currentLength);
         }        
        }
        return count;
    }
}
