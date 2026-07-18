package org.example.DSA.Tree;

import java.sql.ClientInfoStatus;
import java.util.*;

public class TreeProblems {

    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }

    class Pair{
        Node node;
        int hd= 0;

        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
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

    //11. convert sorted array to binary search tree:  https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

    //12. flatten Binary tree to linked list: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
    public static void flatten(Node root) {

        Node current = root;

        while(current != null){

            if(current.left != null){
                Node temp = current.left;
                while(temp.right != null){
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }


    }
    //13. validate binary search tree: https://leetcode.com/problems/validate-binary-search-tree/
//    public boolean isBST(Node root) {
//
//        return helper(root, null, null);
//
//    }

    public boolean helper(Node node, Integer low, Integer high){
        if(node == null){
            return true;
        }

        if(low != null && node.data <= low){
            return false;
        }

        if(high != null && node.data >= high){
            return false;
        }

        boolean leftTree = helper(node.left, low,node.data);
        boolean rightTree = helper(node.right, node.data, high);

        return leftTree && rightTree;
    }
    //14. Lowest common ancestor of a binary tree: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

    //15. Iterative method of PreOrder Traversal

        public ArrayList<Integer> preOrderIterative(Node root){

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node currentNode = stack.pop();
            list.add(currentNode.data);
            if(currentNode.right != null){
                stack.push(currentNode.right);
            }

            if(currentNode.left != null){
                stack.push(currentNode.left);
            }


        }
        return list;
    }

    //16. Iterative method of InOrder Traversal

    //17. Iterative method of PostOrder Traversal

    //18. check for balanced binary tree: lecture 15

    //19. maximum path sum: https://www.geeksforgeeks.org/problems/maximum-path-sum-from-any-node/1

    //20. find if the tree is same or not: https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1

    public boolean isIdentical(Node r1, Node r2) {

        if(r1 == null && r2 == null){
            return true;
        }

        if (r1 == null || r2 == null) {
            return false;
        }


        return r1.data == r2.data && isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
    }

    //21. Boundary traversal in tree: https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Basic,Easy,Medium&sortBy=submissions

    //22. Vertical order traversal: https://www.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1

    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        //Pair pair = new Pair(root, 0);
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){

            Pair current = q.poll();
            Node currNode = current.node;
            int hd = current.hd;

            if(!map.containsKey(hd)){
                map.put(hd, new ArrayList<>());
            }

            map.get(hd).add(currNode.data);

            if(currNode.left != null){
                q.offer(new Pair(currNode.left, hd -1));
            }

            if(currNode.right != null){
                q.offer(new Pair(currNode.right, hd +1));
            }



        }


        for (ArrayList<Integer> list : map.values()) {
            ans.add(list);
        }

        return ans;
    }

    //23. top view of binary tree: https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Basic,Easy,Medium&sortBy=submissions


    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while(!q.isEmpty()){

            Pair currentPair = q.poll();
            Node currNode = currentPair.node;
            int hd = currentPair.hd;

            if(currNode.left != null){
                q.offer(new Pair(currNode.left, hd -1));
            }

            if(currNode.right != null){
                q.offer(new Pair(currNode.right, hd + 1));
            }

            if(!map.containsKey(hd)){
                map.put(hd, currNode.data);
            }
        }

        for(Integer val: map.values()){
            result.add(val);
        }

        return result;

    }

    //24. bottom view of binary tree: https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

    public ArrayList<Integer> bottomView(Node root) {

        ArrayList<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair currPair = q.poll();
            Node currNode = currPair.node;
            int hd = currPair.hd;

            if(currNode.left != null){
                q.offer(new Pair(currNode.left, hd - 1));
            }

            if(currNode.right != null){
                q.offer(new Pair(currNode.right, hd + 1));
            }

            map.put(hd, currNode.data);
        }

        for(int val : map.values()){
            result.add(val);
        }

        return result;

    }

    //24. right view of binary tree:  https://www.geeksforgeeks.org/problems/right-view-of-binary-tree/1

    public ArrayList<Integer> rightView(Node root) {

        ArrayList<Integer> result = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();

            for(int i = 0; i < levelSize; i++){
                Node currentNode = q.poll();

                if(i == levelSize -1){
                    result.add(currentNode.data);
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

    //25. symmetric binary tree: https://www.geeksforgeeks.org/problems/symmetric-tree/1
    public boolean isSymmetric(Node root) {

        Queue<Node> q = new LinkedList<>();


        q.offer(root.left);
        q.offer(root.right);

        while(!q.isEmpty()){
            Node left = q.poll();
            Node right = q.poll();

            if(left == null && right == null){
                continue;
            }


            if(left == null || right == null){
                return false;
            }

            if(left.data != right.data){
                return false;
            }

            q.offer(left.left);
            q.offer(right.right);
            q.offer(left.right);
            q.offer(right.left);

        }

        return true;

    }

    //26. root to leaf path : https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1

    public ArrayList<ArrayList<Integer>> paths(Node root) {

        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();

        ArrayList<Integer> innerList = new ArrayList<>();

        helper(root, outerList, innerList);

        return outerList;

    }

    public void helper(Node node, ArrayList<ArrayList<Integer>> outerList, ArrayList<Integer> innerList){

        if(node == null){
            return;
        }

        innerList.add(node.data);

        if(node.left == null && node.right == null){
            outerList.add(new ArrayList<>(innerList));
            // always create the new Arraylist otherwise innerList stores the reference of Arraylist when
            // we do backtrack then the list inside of outerlist will also change.
        }

        helper(node.left, outerList, innerList);
        helper(node.right, outerList, innerList);

        innerList.remove(innerList.size() -1);
    }



    //27. lowest common ancestor: https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1

    //28. Maximum width of binary
    //
    // tree: https://www.geeksforgeeks.org/problems/maximum-width-of-tree/1

    int maxWidth(Node root) {

        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxWidth = 0;
        while(!q.isEmpty()){
            int levelSize = q.size();
            maxWidth = Math.max(maxWidth, levelSize);

            for(int i = 0; i < levelSize; i++){
                Node currNode = q.poll();

                if(currNode.left != null){
                    q.offer(currNode.left);
                }

                if(currNode.right != null){
                    q.offer(currNode.right);
                }
            }
        }

        return maxWidth;

    }

    //29. children sum property in binary tree: https://www.geeksforgeeks.org/problems/children-sum-parent/1

    public boolean isSumProperty(Node root) {

        if(root == null){
            return true;
        }

        if(root.left == null &&  root.right == null){
            return true;
        }

        int left = (root.left == null) ? 0: root.left.data;
        int right = (root.right == null) ? 0: root.right.data;

        boolean leftAns = isSumProperty(root.left);
        boolean rightAns = isSumProperty(root.right);

        return (root.data == (left + right)) && leftAns && rightAns;

    }

    //30. PRINT ALL THE NODES at the distance of K in binary tree: https://www.geeksforgeeks.org/problems/nodes-at-given-distance-in-binary-tree/1

    //31. Minimum time taken to burn the binary tree:https://www.geeksforgeeks.org/problems/burning-tree/1

    //32. Size of a Complete Binary Tree,  Design an algorithm that runs better than O(n).: https://www.geeksforgeeks.org/problems/count-number-of-nodes-in-a-binary-tree/1

    //34. Search in Binary Tree: https://www.geeksforgeeks.org/problems/search-a-node-in-bst/1

    //35. ceil in BST: https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1
    
    //36. floor in BST: https://www.geeksforgeeks.org/problems/closest-neighbor-in-bst/1
    public int findMaxFork(Node root, int k) {

        int floor = -1;

        while(root != null){
            if(root.data == k){
                floor = k;
                return floor;
            }

            if(k > root.data){
                floor = root.data;
                root = root.right;
            }else{
                root = root.left;
            }
        }

        return floor;

    }

    //37. insert in a BST: https://www.geeksforgeeks.org/problems/closest-neighbor-in-bst/1


    //38. Delete a node from binary tree: 
    
    //39. Kth smalles element in the BST:

    //40. check if a tree is BST or BT:

    public static void main(String[] args) {

    }


}
