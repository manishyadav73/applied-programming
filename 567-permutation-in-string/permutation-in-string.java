class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        if(n>s2.length())return false;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<=s2.length()-n;i++){
            String s=s2.substring(i,i+n);
            HashMap<Character,Integer>window=new HashMap<>();
            for(char c:s.toCharArray()){
                window.put(c,window.getOrDefault(c,0)+1);
            }
             if(map.equals(window))return true;
           
        }
         
        return false;
    }
}