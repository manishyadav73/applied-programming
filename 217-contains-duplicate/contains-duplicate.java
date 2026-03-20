import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] arr) {
      HashSet<Integer>hs=new HashSet<>();
      for(int num:arr){
        if(hs.contains(num)){
            return true;
        }
        hs.add(num);
      }
      return false;
    }
}