//optimal
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int c1 =0, c2 =0;
        int e1 = -1, e2 = -1;
        for(int num : nums){
            if(num == e1){
                c1++;
            }else if(num == e2){
                c2++;
            }else if(c1 == 0){
                e1 = num;
                c1 = 1;
            }else if(c2 == 0){
                e2 = num;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = c2 =0;
        for(int ele : nums){
            if(ele == e1) c1++;
            else if(ele == e2) c2++;
        }
        if(c1 > (n/3)){
            list.add(e1);
        }
        if(c2 > (n/3) ){
            list.add(e2);
        }
        return list;
    }
}