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
        ListNode ptr1 = l1;
        ListNode prev = l1;
        ListNode ptr2 = l2;
        int flag = 0;
        while(ptr1 != null && ptr2 != null) {
            int sum = ptr1.val + ptr2.val + flag;
            flag = 0;
            if (sum > 9) {
                sum = sum - 10;
                flag = 1;
            }
            ptr1.val = sum;
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        //if first list smaller than second list
        if (ptr2 != null) {
            prev.next = ptr2;
            prev = prev.next;
            if (flag == 1) {
                while (flag != 0 && ptr2 != null) {
                    int sum = flag + ptr2.val;
                    flag = 0;
                    if (sum > 9) {
                        sum = sum - 10;
                        flag = 1;
                    }
                    ptr2.val = sum;
                    prev = ptr2;
                    ptr2 = ptr2.next;
                }
            }
        }
        if (ptr1 != null) {
            if (flag == 1) {
                while (flag != 0 && ptr1 != null) {
                    int sum = flag + ptr1.val;
                    flag = 0;
                    if (sum > 9) {
                        sum = sum - 10;
                        flag = 1;
                    }
                    ptr1.val = sum;
                    prev = ptr1;
                    ptr1 = ptr1.next;
                }
            }    
        }
        if (ptr1 == null && ptr2 == null && flag == 1) {
            ListNode last = new ListNode(1, null);
            prev.next = last;
        }
        return l1;
    }
}