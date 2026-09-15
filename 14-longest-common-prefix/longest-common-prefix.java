class Solution {
    public String longestCommonPrefix(String[] strs) {
      int minLength=strs[0].length();
       String s="";
       for(int i=0;i<strs.length-1;i++){
        String first=strs[i];
        String sec=strs[i+1];
       int j=0;
       int min=Math.min(strs[i].length(),strs[i+1].length());
       while(j<min){
        if(first.charAt(j)!=sec.charAt(j))break;
        j++;
       }
          minLength=Math.min(minLength,j);
       }
       return strs[0].substring(0,minLength);
       
    }
}