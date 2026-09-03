class Solution {
    public int thirdMax(int[] nums) {
       
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
          
                set.add(n);
            
        }
        List<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        
        int m=list.size();
        if(m<3){
            return list.get(m-1);
        }
        return list.get(m-3);
    }
}