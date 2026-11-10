class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer>map=new HashMap<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.size()>1){
                    int max=0;
                    int min=Integer.MAX_VALUE;
                    for(int count:map.values()){
                        max=Math.max(max,count);
                        min=Math.min(min,count);
                    }
                  sum+=(max-min);
                }
            }
        }
        return sum;
    }
}