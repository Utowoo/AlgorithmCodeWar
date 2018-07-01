package org.codeWar.Algorithm;

import org.codeWar.DataStructure.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead; // Create return listNode structure
        dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead; // initial varibles
        int carry = 0; // carry to next digit
        while(p != null || q != null){
            int x = 0, y = 0, sum = 0;
            if (p != null) {
                x = p.val;
                p = p.next;
            }else{
                x = 0;
            }
            if (q != null) {
                y = q.val;
                q = q.next;
            }else{
                y = 0;
            }
            sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if (carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(){
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
    }
}
