class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
      
        int maxLen=0;
         int maxfreq=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            while((i-left+1)-maxfreq>k){
                char first=s.charAt(left);
                map.put(first,map.get(first)-1);
               
                left++;
            }
            maxLen=Math.max(maxLen,i-left+1);
        }
     return maxLen;
    }
}