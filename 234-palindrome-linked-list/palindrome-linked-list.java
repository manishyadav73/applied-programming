class Solution {
    public boolean isPalindrome(ListNode head) {
      List<Integer>list=new ArrayList<>();
    //   if(head==null)return false;
      ListNode temp=head;
      while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
      }
      int n=list.size();
      int left=0;
      int right=n-1;
      while(left<=right){
        if(list.get(left)!=list.get(right))return false;
        left++;
        right--;
      }
      return true;
    }
}