class Solution {
    public int totalFruit(int[] fruits) {
    HashMap<Integer,Integer>map=new HashMap<>();
    int count=0;
    int maxFruits=0;
    for(int i=0;i<fruits.length;i++){
    int currfruits=fruits[i];
        map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);

while(map.size()>2){
    int leftfruits=fruits[count];
    map.put(leftfruits,map.get(leftfruits)-1);
    if(map.get(leftfruits)==0){
        map.remove(leftfruits);
    }
    count++;
}
maxFruits=Math.max(maxFruits,i-count+1);
    }
      return maxFruits;
    }
}