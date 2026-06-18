
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int m:nums){
            map.put(m,map.getOrDefault(m,0)+1);
            if(map.get(m)>n/2)return m;
        }
        return 0;
    }
}