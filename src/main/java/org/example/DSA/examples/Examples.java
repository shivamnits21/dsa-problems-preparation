package org.example.DSA.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Examples {
    
       public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    public static int diameter = 0;

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

       // System.out.println(diameterOfBinaryTree());

    }


    public static int diameterOfBinaryTree(TreeNode root) {

        height(root);

        return diameter - 1;

    }

    public static int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;

        diameter = Math.max(diameter, dia);


        return Math.max(leftHeight, rightHeight) + 1;
    }

    }


