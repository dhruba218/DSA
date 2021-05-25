package com.employee;

// ************************************ TODO F1 ************************************
/*
 * Implement a Singly linkedList
 *
 */

public class SingleLinkedList {

    // ************************************ SOLUTION F1 BEGIN ************************************


    class Node{

        PermanentEmployee  permanentEmployee;

        Node next;

        public Node(PermanentEmployee  permanentEmployee)
        {
            this.permanentEmployee = permanentEmployee;

            next = null;
        }

    }

    Node head;
    Node tailNode;
    public int tail;

    public  void  add( PermanentEmployee permanentEmployee)
    {
        Node n;

        n = new Node(permanentEmployee);

        if(head == null)
        {

            head = n;
            tailNode = head;
            tail = tailNode.permanentEmployee.getId();
            return;
        }

        tailNode.next = n;

        tailNode = tailNode.next;

        tail = tailNode.permanentEmployee.getId();

        //System.out.print(tail+"\n");
    }




    // ************************************ SOLUTION F1 END ************************************

}
