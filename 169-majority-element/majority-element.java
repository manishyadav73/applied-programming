
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int m=n/2;
        for(int k:nums){
            map.put(k,map.getOrDefault(k,0)+1);
            if(map.get(k)>m){
                return k;
            }
        }
        return -1;
    }
}