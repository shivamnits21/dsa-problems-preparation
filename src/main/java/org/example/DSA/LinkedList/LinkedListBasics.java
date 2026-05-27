package org.example.DSA.LinkedList;

// Important notes on techniques on Linked list to solve problems
 // 1. if i've to delete the node without traversing the linked list like it is given just the node
// question provided on GFG we can do it by copy the data of next node and skip that node if i
//I'm  landing on the same node that i've to delete i can do it by copy data of the  next node
// currentNode.data = current.next.data, current.next = current.next.next if deleted node is not the last node.

import org.apache.catalina.users.SparseUserDatabase;

public class LinkedListBasics {

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }

     Node head;
     Node tail;


    public  void addFirst(int val){
        Node newNode = new Node(val);

        if(tail == null){
            tail = head;
        }
            newNode.next = head;
            head = newNode;


    }

    public void addLast(int val){
        Node newNode = new Node(val);

            if(tail == null){
                head = newNode;
                tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // add at any index

    public void addAtIndex(int val, int index){

        Node temp = head;
        Node newNode = new Node(val);

        for(int i = 1; i < index - 1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }


    public int deleteFirst(){

        if(head == null){
            System.out.println("list is empty nothing to delete");
        }

        int temp = head.data;
        head = head.next;

        return temp;
    }

    public int deleteLast(){

        if(tail == null){
            System.out.println("list is empty nothing to delete");
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        int x = tail.data;
        temp.next = tail.next;
        tail = temp;

        return x;
    }

    // delete at any index

    public int deleteAtIndex(int index){

        if(index == 1){
            return deleteFirst();
        }

        if(head == null){
            System.out.println("list is empty nothing to delete");
        }
        Node temp = head;

        for(int i = 1; i < index -1; i++){
            temp = temp.next;
        }

        int x = temp.next.data;
        temp.next = temp.next.next;
        return x;
    }

    public void display(){

        Node currentNode = head;

        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("NULL ");

    }



    // solve the same using the recursion insert node at any index





    // Sort the linked list using the bubble sort



    public static void main(String[] args) {
        LinkedListBasics list = new LinkedListBasics();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.addAtIndex(8,3 );

        list.display();

        System.out.println(list.deleteAtIndex(3));
           list.display();
    }

}
