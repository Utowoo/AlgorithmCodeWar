package org.codeWar.Algorithm;

import org.codeWar.DataStructure.ListNode;

public class TestListNodeJava {
   public static void main(String arg[]){
       ListNode a = new ListNode(1);
       a.next = new ListNode(2);

       System.out.println(a.toString());
       System.out.println(a.next.toString());
   }
}
