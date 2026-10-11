class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            set2.add(n);
        }
       int res[]=new int[set1.size()];
       int k=0;
       for(int n:set1){
           if(set2.contains(n)){
            res[k]=n;
            k++;
           }
       }
       return Arrays.copyOfRange(res,0,k);
    }
}