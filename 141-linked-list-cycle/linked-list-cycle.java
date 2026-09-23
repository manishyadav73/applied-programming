/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      Set<ListNode>set=new HashSet<>();
      ListNode temp=head;
      int count=0;
      while(temp!=null){
        if(set.contains(temp)){
            return true;}
            set.add(temp);
        
       temp=temp.next;
       count++;
      }
      if(count<2)return false;
     return false;
    }
}