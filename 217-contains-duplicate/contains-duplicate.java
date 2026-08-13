import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer>st=new HashSet<>();
        for(int n:arr){
            if(st.contains(n))return true;
            st.add(n);
        }
        return false;
    }
}