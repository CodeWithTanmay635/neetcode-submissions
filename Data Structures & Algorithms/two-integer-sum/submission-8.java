class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
           for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
           }
           for(int i = 0; i < nums.length; i++){
            int component = target - nums[i];
            if(map.containsKey(component) && map.get(component) != i){
                return new int[] {i, map.get(component)};
            }
           }
           return new int[] {};
    }
}
