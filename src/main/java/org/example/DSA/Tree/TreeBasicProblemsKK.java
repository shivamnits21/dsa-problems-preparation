package org.example.DSA.Tree;

import java.util.Scanner;

public class TreeBasicProblemsKK {


    private static class Node{
        int value;
        Node left;
        Node right;

       public Node(int value){
            this.value = value;
        }

    }

    private static Node root;


    public static void inserNode(){

        System.out.println("Enter the root node");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        root = new Node(val);
        helper(sc, root);
    }

    public static void helper(Scanner sc, Node node){

        if(node == null){
            return;
        }

        System.out.println("Do you want to enter the left node of " + node.value);
        boolean left = sc.nextBoolean();

        if(left){
             System.out.println("Enter the left Node of" + node.value);
             int value = sc.nextInt();
             Node leftNode = new Node(value);
             node.left = leftNode;
             helper(sc,node.left);
        }

        System.out.println("Do you want to enter the right node of " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the right Node of" + node.value);
            int value = sc.nextInt();
            Node rightNode = new Node(value);
            node.right = rightNode;
            helper(sc,node.right);
        }

    }

    public static void display(){
        display(root);
    }

    public static void display(Node node) {

        if (node == null) {
            return;
        }

        if (node.left != null) {
            System.out.println("Left of " + node.value + " is " + node.left.value);
        } else {
            System.out.println("Left of " + node.value + " is null");
        }

        display(node.left);
        if (node.right != null) {
            System.out.println("Right of " + node.value + " is " + node.right.value);
        } else {
            System.out.println("Right of " + node.value + " is null");
        }

        display(node.right);


    }



    public static void main(String[] args) {
        inserNode();
        display();
    }

}
