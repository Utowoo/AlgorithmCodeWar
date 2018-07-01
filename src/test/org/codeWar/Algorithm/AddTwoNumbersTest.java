package org.codeWar.Algorithm; 


import org.codeWar.DataStructure.ListNode;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.Assert;

import java.util.ArrayList;

/** 
* AddTwoNumbers Tester. 
* 
* @author <Qian Wu>
* @since <pre>Jul 1, 2018</pre> 
* @version 1.0 
*/ 
public class AddTwoNumbersTest { 

    int[] input1 = {2,4,3};
    int[] input2 = {5,6,4};
    ListNode list1 = new ListNode(0);
    ListNode list2 = new ListNode(0);

    @Before
    public void setup() throws Exception {
        for(int i = 0; i < input1.length; i++){
            list1.next = new ListNode(input1[i]);
            list1 = list1.next;
        }
        for(int i = 0; i < input2.length; i++){
            list2.next = new ListNode(input2[i]);
            list2 = list2.next;
        }


    }



    /**
    *
    * Method: addTwoNumbers(ListNode l1, ListNode l2)
    *
    */
    @Test
    public void testAddTwoNumbers() throws Exception {
    //TODO: Test goes here...
        ListNode result = AddTwoNumbers.addTwoNumbers(list1.next,list2.next);
        System.out.println(result);
    }


} 
