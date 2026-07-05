package org.example.DSA.Tree;

import java.sql.ClientInfoStatus;
import java.util.*;

public class TreeProblems {

    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }


    class Node {
        int data;
        Node left, right;
        Node(int d)
        {
            data  =d;
            left = right = null;
        }
    }

    //1. BFS :- traverse the binary tree by level order

    public ArrayList<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> current = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                current.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }

            result.add(current);

        }

        return result;

    }

    //2. Average of levels in the tree: LeetCode: https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            double sum = 0;
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                sum += currentNode.val;

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }

            }
            result.add(sum/levelSize);
        }

        return result;
    }

    //3. Find successor: next element to the given node

    public static int findSuccessor(TreeNode root, int k){

        if(root == null){
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        while(!queue.isEmpty()){
               TreeNode currentNode = queue.poll();

               if(currentNode.left != null){
                   queue.offer(currentNode.left);
               }
               if(currentNode.right != null){
                   queue.offer(currentNode.right);
               }

               if(currentNode.val == k){
                   TreeNode ans = queue.poll();
                   return ans.val;
               }
           }

        return -1;
    }


    //4.DONE :  https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

    ArrayList<Integer> zigZagTraversal(Node root) {

        ArrayList<Integer> result = new ArrayList<>();

        Deque<Node> dq = new LinkedList<>();
        dq.addFirst(root);
        boolean flag = false;
        while(!dq.isEmpty()){
            int levelSize = dq.size();

            for(int i = 0; i < levelSize; i++){
                if(!flag){
                    Node currentNode = dq.removeFirst();
                    if(currentNode.left != null){
                        dq.addLast(currentNode.left);
                    }

                    if(currentNode.right != null){
                        dq.addLast(currentNode.right);
                    }

                    result.add(currentNode.data);
                }


                if(flag){
                    Node currentNode = dq.removeLast();

                    if(currentNode.right != null){
                        dq.addFirst(currentNode.right);
                    }

                    if(currentNode.left != null){
                        dq.addFirst(currentNode.left);
                    }

                    result.add(currentNode.data);
                }

            }
            flag = !flag;

        }

        return result;

    }

    //5. https://leetcode.com/problems/populating-next-right-pointers-in-each-node/


    //6. https://leetcode.com/problems/binary-tree-right-side-view/description/

    public ArrayList<Integer> rightView(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();

            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = q.poll();

                if(i == levelSize -1){
                    result.add(currentNode.val);
                }

                if(currentNode.left != null){
                    q.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    q.offer(currentNode.right);
                }
            }
        }

        return result;
    }

    //7. cousins in binary tree: https://leetcode.com/problems/cousins-in-binary-tree/description/

    //8. Diameter of a binary tree: https://leetcode.com/problems/diameter-of-binary-tree/

    int dia = 0;
    public int diameter(Node root) {

        int max = helperDiameter( root);

        return dia;
    }

    public int helperDiameter(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = helperDiameter(root.left);
        int rightHeight = helperDiameter(root.right);


        dia =  Math.max(dia, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    //9. invert binary tree: https://leetcode.com/problems/invert-binary-tree/

    void mirror(Node node) {
        helperMirror(node);
    }

    public Node helperMirror(Node node){
        if(node == null){
            return null;
        }

        Node left = helperMirror(node.left);
        Node right = helperMirror(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    //10. Maximum depth of binary tree

    public static int maxDepth(Node root) {

        if(root == null){
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    //11.convert sorted array to binary search tree:  https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

    //12. flatten Binary tree to linked list: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

    //13. validate binary search tree: https://leetcode.com/problems/validate-binary-search-tree/

    //14. Lowest common ancestor of a binary tree: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

    //15. Iterative method of PreOrder Traversal

    //16. Iterative method of InOrder Traversal

    //17. Iterative method of PostOrder Traversal

    //18. Maximum depth in binary tree: lecture 14

    //19. check for balanced binary tree: lecture 15

    //20. maximum path sum

    //21. find if the tree is same or not.


    //22.

    public static void main(String[] args) {

    }


}
