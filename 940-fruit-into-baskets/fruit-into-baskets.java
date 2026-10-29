class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;
        int max=0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);

            while(map.size()>2){
                int curr=fruits[left];
                map.put(curr,map.get(curr)-1);

                if(map.get(curr)==0)map.remove(curr);
               left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}