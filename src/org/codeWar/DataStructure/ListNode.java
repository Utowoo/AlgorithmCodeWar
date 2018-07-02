package org.codeWar.DataStructure;

public class ListNode {
       public int val;
       public ListNode next;

    /**
     * @param x
     */
       public ListNode(int x) {
           this.val = x;
       }

    /**
     *
     */
    @Override
    public String toString() {

        String ret = null;
        if(this != null){
            ret = "Current ListNode value:" + this.val + "\n";
        }
        if(this.next !=  null){
            ret = ret + "next ListNode Value:" + this.next.val + "\n";
        }else{
            ret = ret + "The Next ListNode is null\n";
        }
        return ret;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        a.next = new ListNode(2);

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.toString());
    }
}
