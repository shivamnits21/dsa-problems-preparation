package org.example.DSA.Tree;

public class BinarySearchTree {

    public class Node{
        Node left;
        Node right;
        int value;

        int height;

        Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

     Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
      //  Node node = new Node(value);
        root = populate(value, root);
    }

    public Node populate(int value, Node node){

        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = populate(value,node.left);
        }

        if(value > node.value){
            node.right = populate(value, node.right);
        }

        node.height = Math.max(height(root.left), height(root.right)) + 1;

        return node;
    }

    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            insert(nums[i]);
        }
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
     if(node == null){
         return true;
     }
     return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "left child of " + node.getValue()+ ": ");
        display(node.right, "right child of " + node.getValue()+ ": ");
    }






    public static void main(String[] args) {
     BinarySearchTree tree = new BinarySearchTree();

     int[] arr = new int[]{15,8,5,11,9,17,13,20};

     tree.populate(arr);
     tree.display();
    }


}
