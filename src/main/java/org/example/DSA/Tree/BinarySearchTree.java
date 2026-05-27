package org.example.DSA.Tree;

import org.hibernate.tool.schema.extract.internal.SequenceInformationExtractorHSQLDBDatabaseImpl;

public class BinarySearchTree {

   public class Node {
        int val;
        Node left;
        Node right;
        int height;

        Node(int val){
            this.val = val;
        }

        public int getValue(){
            return val;
        }
    }

    Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(Node node){
        return node == null;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced (Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public Node insert(Node node, int value){
        if(node == null){
            Node newNode = new Node(value);
            return newNode;
        }

        if(value < node.val){
            node.left = insert(node.left, value);
        }

        if(value > node.val){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums){
        for(int i = 0; i< nums.length; i++){
            insert(nums[i]);
        }
    }



    public void display(){

        display(root,"Root Node : ");
    }

    public void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.val);
        display(node.left, "Left child of: " + node.getValue() + ": ");
        display(node.right, "Right child of: " + node.getValue() + ": ");
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] nums = {5,2,1,4,7,10};

        tree.populate(nums);
        tree.display();
    }


}
