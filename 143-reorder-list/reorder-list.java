/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ArrayList<ListNode>list=new ArrayList<>();
     
      ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
       
        int first=0;
        int last=list.size()-1;
        while(first<last){
            list.get(first).next=list.get(last);
            first++;
            if(first==last)break;
            list.get(last).next=list.get(first);
            last--;

        }
        // for(int i=0;i<res.size();i++){
        //     System.out.print(res.get(i)+",");
        
 list.get(first).next = null;
    }
}