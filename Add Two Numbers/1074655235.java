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
        ListNode l1_p = l1;
        ListNode l2_p = l2;
        ListNode re = null;
        ListNode re_p = re;
        int left = 0;
        while (l1_p!=null || l2_p !=null){
            int val = left;
            if (l1_p != null) {
                val = val+l1_p.val;
                l1_p = l1_p.next;
            }
            if (l2_p != null) {
                val = val+l2_p.val;
                l2_p = l2_p.next;
            }
            if (val > 9 ){
                val = val- 10;
                left = 1;
            }else{
                left = 0;
            }
            if (re_p==null){
                re = new ListNode(val);
                re_p = re;
            }else{
                re_p.next = new ListNode(val);
                re_p = re_p.next;
            }
            
        }
        if (left > 0) re_p.next = new ListNode(left);

        return re;
        
    }
}