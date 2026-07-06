class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> map=new HashMap<>();
      for(String manish:strs){
        char arr[]=manish.toCharArray();
        Arrays.sort(arr);
        String key=new String(arr);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(manish);
      }
      return new ArrayList<>(map.values());
    }
}