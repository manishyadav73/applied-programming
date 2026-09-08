class Solution {
    public String addBinary(String a, String b) {
      if(a.length()<b.length()) return addBinary(b,a);
      int n=a.length();
      int m=b.length();
      StringBuilder res=new StringBuilder();
      int carry=0;
      for(int i=n-1,j=m-1;i>=0;i--,j--){
        int sum=carry;
       if(a.charAt(i)=='1'){
        sum+=1;
       }if(j>=0&&b.charAt(j)=='1'){
        sum+=1;
       }
       res.append(sum%2);
       carry=sum/2;
   

      }  
      if(carry==1){
        res.append(1);
      }
      res.reverse();
      return res.toString();
    }
}