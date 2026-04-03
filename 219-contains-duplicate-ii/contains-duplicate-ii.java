class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
       int n=arr.length;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++){
        if(map.containsKey(arr[i])){
            int prevIndex=map.get(arr[i]);
            if(i-prevIndex<=k) return true;
        }
        map.put(arr[i],i);
       }
       return false;
    }
}
