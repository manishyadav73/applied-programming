class Solution {
    public boolean isPalindrome(String s) {
char[] m = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
int first=0;
int  last=m.length-1;
while(first<=last){
    if(m[first]!=m[last]) return false;
    first++;
    last--;
}
return true;
       
    }
}
