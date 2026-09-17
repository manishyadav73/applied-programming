import java.util.*;
class Solution {
    public String reverseWords(String s) {
       String m[]=s.trim().split("\\s+");
       int n=m.length;
       StringBuilder res=new StringBuilder();
       for(int i=n-1;i>=0;i--){
        res.append(m[i]);
        if(i!=0){
            res.append(" ");
        }
        
       }
  return res.toString();    
}}