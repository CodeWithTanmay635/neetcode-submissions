class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int k = n / 3;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int ele = entry.getKey();
                int cnt = entry.getValue();
                if(cnt > k){
                    list.add(ele);
                }
        }
        
        return list;
    }
}