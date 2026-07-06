import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] arr) {
      HashSet<Integer>set=new HashSet<>();
      int n=arr.length;
      for(int m:arr){
        if(set.contains(m)){
return true;
        }
        set.add(m);
      }
      return false;
    }
}