package org.example.DSA.Tree;

import lombok.val;

import java.util.Scanner;

public class BasicTree {

    class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    Node root;


    public void insertNode(int val){

        System.out.println("Enter the root Node: ");
        Scanner sc = new Scanner(System.in);
         int value = sc.nextInt();

        Node root = new Node(value);

         helper(sc, root);

    }

    private void helper(Scanner sc, Node node) {

        if(node == null){
            return;
        }


        System.out.println("Do you want the enter the left of " + node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the left Node of :" + node.val);
            int value = sc.nextInt();
            node.left = new Node(value);
            helper(sc,node.left);
        }


        System.out.println("Do you want the enter the Right of " + node.val);
        boolean right = sc.nextBoolean();

        if(right){
            System.out.println("Enter the right Node of :" + node.val);
            int value = sc.nextInt();
            node.right = new Node(value);
            helper(sc, node.right);
        }

    }





    public void display(){
        display(root, " ");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }

        System.out.println(indent + node.val);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicTree tree = new BasicTree();
        tree.insertNode(15);
        tree.display();
    }


}
