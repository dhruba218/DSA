package com.employee;

// ************************************ TODO G1 ************************************
/*
 * Implement a Queue and its basic operations using LinkedList
 */


public class Queue {

    // ************************************ SOLUTION G1 BEGIN ************************************

    QNode front;
    QNode rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int id) {
        QNode newNode = new QNode(id);
        if(isEmpty()) {
            front = newNode;
        }else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int deQueue(){

        int temp = front.id;
        if(front.next == null){
            rear = null;
        }
        front = front.next;
        return temp;
    }

    public int queueCount() {

        int queueCount =0;
        QNode current = front;
        while (current != null) {
            current = current.next;
            queueCount++;
        }
        return queueCount;
    }


}

class QNode {
    int id;
    QNode next;

    public QNode(int id) {
        this.id = id;
        this.next = null;
    }
}

//************************************ SOLUTION G1 END ************************************
