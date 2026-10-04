class Solution {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer>set=new HashSet<>();
    int max=0;
    for(int n:nums){
        set.add(n);
    }
    for(int n:set){
        if(set.contains(n-1))continue;
        int count=1;
        int first=n;
        while(set.contains(first+1)){
            count++;
            first++;
        }
        max=Math.max(count,max);
    }
return max;
}
}