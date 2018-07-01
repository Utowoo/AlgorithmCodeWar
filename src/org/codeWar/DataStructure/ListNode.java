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
        String ret = "{ ";
        while(this != null){
            ret = ret + this.val + " ";
        }
        ret = ret + "};";
        return ret;
    }
}
