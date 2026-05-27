package org.example.DSA.LinkedList;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class LinearLinkedList {

    private Node head;
    private Node tail;

    public class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
             this.data = data;
             this.next = next;
        }
    }


    public int deleteAtIndex(int index){
        Node currentNode = head;
        if(index == 0){
           return deleteFirst();
        }

        for(int i = 1; i< index; i++){
            currentNode = currentNode.next;
        }
        int x = currentNode.next.data;
        currentNode.next = currentNode.next.next;

        return x;
    }

    public int deleteLast(){
        Node currentNode = head;
        if(tail == null){
            System.out.println("Nothing to delete");
            return -1;
        }

        while(currentNode.next.next != null){
            currentNode = currentNode.next;
        }

        int x = currentNode.next.data;
        currentNode.next = null;
        tail = currentNode;
        return x;
    }

    public int deleteFirst(){
        if(head == null){
            System.out.println("List is empty NOthing to delete");
            return -1;
        }
        int x = head.data;
        head = head.next;
        return x;
    }

    public void insertLast(int element){
        Node node = new Node(element);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }


    }

    public void insertFirst(int element){
        Node newNode = new Node(element);

        if( tail == null){
            tail = head;
        }

        newNode.next = head;
        head = newNode;

    }

    public void insertAtIndex(int index, int element){
        Node node = new Node(element);
        Node currentNode = head;

        if(index == 0){
           insertFirst(element);
            return;
        }

        for(int i = 1; i< index ; i++){
            currentNode = currentNode.next;
        }

        node.next = currentNode.next;
        currentNode.next =node;
    }

    public void display(){

        Node currentNode = head;

        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println(" NULL ");

    }

    public static int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        int count = 0;
        while(n != 0){
            int digit = n % 10;
            freq[digit]++;
            n = n / 10;
        }
        int min = Integer.MAX_VALUE;
        int resultDigit = -1;
        for(int i = 0; i < 10 ; i++){
          if(freq[i] < min && freq[i] != 0){
              min = freq[i];
              resultDigit = i;
          }
        }
          return resultDigit;
    }

    public static void main(String[] args) {

        System.out.println(getLeastFrequentDigit(1553322));

//        LinearLinkedList list = new LinearLinkedList();
//        list.insertLast(3);
//        list.insertLast(5);
//        list.insertLast(7);
//        list.insertLast(9);
//        list.insertFirst(1);
//        list.insertAtIndex(2, 11);
//        list.display();
//        System.out.println( list.deleteFirst());
//
//        list.display();
//       // System.out.println(list.deleteLast());
//        System.out.println(list.deleteAtIndex(0));
//        list.display();

    }


}
