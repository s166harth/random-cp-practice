class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        ListNode curr = head;
        ListNode dummy = new ListNode(-10000000);
        dummy.next=head;
        ListNode prev = dummy;
        if(head==null||head.next==null)return head;
        while(curr!=null)
        {
            if(curr.val>prev.val)
            {
                prev=curr;
                curr=curr.next;

            }
            else{
                ListNode temp = dummy;
                while(temp.next.val<curr.val)
                {
                    temp=temp.next;
                }
                prev.next=curr.next;
                curr.next=temp.next;
                temp.next=curr;
                curr=prev.next;
            }
            


        }
        return dummy.next;
        
    }
}