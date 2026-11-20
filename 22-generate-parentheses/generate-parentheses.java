class Solution {
    public List<String> generateParenthesis(int n) {
       ArrayList<String>ans=new ArrayList<>();
       StringBuilder sb=new StringBuilder();
       solve(0,0,n,sb,ans);
       return ans; 
    }
    private static void solve(int open,int close,int n, StringBuilder sb,List<String>ans){
        if(sb.length()==n*2){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            solve(open+1,close,n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            solve(open,close+1,n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}