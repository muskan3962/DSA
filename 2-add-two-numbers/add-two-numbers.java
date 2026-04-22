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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int sum =0;
        int carry =0;
        while(l1 != null || l2!=null || carry !=0){
            int x = (l1!=null)?l1.val:0;
            int y = (l2 != null)? l2.val:0;
            sum = x+y+carry;
            ListNode newNode  = new ListNode(sum%10);
            temp.next = newNode;
            temp = temp.next;
            carry = sum/10;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return ans.next;
    }
}