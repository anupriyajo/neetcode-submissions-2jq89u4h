class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res [] = new int[2];
        for(int i=0;i<nums.length;i++){
            int rest = target-nums[i];
            if(map.containsKey(rest)) {
                res[0] = Math.min(i, map.get(rest)); 
                res[1] = Math.max(i, map.get(rest));
                break;
            }
            else
                map.put(nums[i],i);
        }
        return res;
    }
}
