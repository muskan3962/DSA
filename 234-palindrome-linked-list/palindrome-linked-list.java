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
    public boolean isPalindrome(ListNode head) {
        if(head ==null || head.next == null){
            return true;
        }
        // find the middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next !=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        // reverse the second half
        ListNode secondHalfHead = reverse(slow.next);

        // compare the first half with reverse second half
        ListNode p1 = head;
        ListNode p2 = secondHalfHead;
        boolean isPalindrom = true;
        while(p2!= null){
            if(p1.val != p2.val){
                isPalindrom =false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
      return isPalindrom ; 
    }
    private ListNode reverse(ListNode head){
        ListNode prev =null;
        while(head !=null){
            ListNode nextTemp =head.next;
            head.next = prev;
            prev= head;
            head =nextTemp;
        }
        return prev;
    }
}