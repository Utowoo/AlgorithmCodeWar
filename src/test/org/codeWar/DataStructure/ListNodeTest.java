package org.codeWar.DataStructure; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* ListNode Tester. 
* 
* @author <Authors name> 
* @since <pre>Jul 1, 2018</pre> 
* @version 1.0 
*/ 
public class ListNodeTest {

    ListNode list1 = new ListNode(1);
    ListNode list3 = new ListNode(1);


    @Before
    public void setUp() throws Exception {
        list1.next = new ListNode(4);
    }
    /**
    *
    * Method: toString()
    *
    */
    @Test
    public void testToString() throws Exception {
    //TODO: Test goes here...
        System.out.println(list1.toString());
    }


} 
