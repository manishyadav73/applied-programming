class Solution {
  private  static boolean isPalindrome(String m){
        int left=0;
        int right=m.length()-1;
        while(left<right){
            if(m.charAt(left)!=m.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int left=0;
        int count=0;
        int right=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
            if(isPalindrome(s.substring(j,i+1))){
                count++;
            }
            }
        }
        return count;
    }
}