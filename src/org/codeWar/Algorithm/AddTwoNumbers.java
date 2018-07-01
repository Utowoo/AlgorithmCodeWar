package org.codeWar.Algorithm;

import org.codeWar.DataStructure.ListNode;

import java.util.LinkedList;


public class AddTwoNumbers {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {

        LinkedList<Integer> ret = new LinkedList<Integer>();

        LinkedList<Integer> p = l1, q = l2; // initial varibles
        int carry = 0; // carry to next digit
        while(p.size() > 0 || q.size() > 0){
            int x = 0, y = 0, sum = 0;
            if (p.size() > 0) {
                x = p.pop();
            }else{
                x = 0;
            }
            if (q.size() > 0) {
                y = q.pop();
            }else{
                y = 0;
            }
            sum = carry + x + y;
            carry = sum / 10;
            ret.add(sum % 10);

        }
        if (carry > 0){
            ret.add(carry);
        }
        return ret;
    }

    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        list1.add(2);
        list1.add(4);
        list1.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(4);

        LinkedList<Integer> result = addTwoNumbers(list1, list2);
        System.out.println(result.toString());
    }
}
