package org.example.DSA.recursion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

//ArraysRule to Remember
//        Immutable Objects
//
//        No backtracking needed.
//
//        Examples:
//
//        String
//        Integer
//        Long
//        Double
//        Boolean
//
//        Because:
//
//        p + "D"
//
//        creates a new object.
//
//        Mutable Objects
//
//        Backtracking usually required.
//
//        Examples:
//
//        ArrayList
//        HashSet
//        HashMap
//        StringBuilder
//        int[] array
//        char[] array
//
//        Because:
//
//        add()
//        remove()
//        put()
//        set()
//
//        modify the same object.

//If creating a new object:
//
//        p + "D"
//
//        ➡️ No backtracking.
//
//        If modifying the same object:
//
//        path.add(...)
//
//        ➡️ Backtracking required.


public class Backtracking {


    //11.Genrating all the subarrays



    //11. Find all possible paths from top to bottom

    //. in this question we are passing the arraylist in the arguments that's why only the reference is changing
    //in every call

    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n, int m, int[][] mat) {

        return findPaths(0, 0, mat, new ArrayList<Integer>());

    }

    public static ArrayList<ArrayList<Integer>> findPaths(
            int n,
            int m,
            int[][] mat,
            ArrayList<Integer> current) {

        if (n == mat.length - 1 && m == mat[0].length - 1) {

            current.add(mat[n][m]);

            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

            ans.add(new ArrayList<>(current));
            ans.add(current);

//            then ans stores a reference to the same list.
//                    Memory picture:
//            current ------+
//                    |
//                    ans ----------+
//            Both point to the same object.
//            Now backtracking happens:
//            current.remove(...)
//            Current becomes:
             //[1,4,7,8]
//            Since ans points to the same object:
//            ans also becomes [1,4,7,8]
//            which is wrong.So here we store the copy of current
  //          Now:
//            current --> [1,4,7,8,9]
//            copy    --> [1,4,7,8,9]

            current.remove(current.size() - 1);

            return ans;
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        current.add(mat[n][m]);

        if (n < mat.length - 1) {
            list.addAll(findPaths(n + 1, m, mat, current));
        }

        if (m < mat[0].length - 1) {
            list.addAll(findPaths(n, m + 1, mat, current));
        }

        current.remove(current.size() - 1);

        return list;
    }



    //10. NQueens problem



    //9. Dice problem


    //8. leetcode:


    //7. print all the paths show it like the matrix path.

    public static void allDirectionsPrintPath(String p, boolean[][] maze, int r, int c, int[][] path, int step) {

        if(r == maze.length -1 && c == maze[0].length -1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;


        if(r < maze.length -1){
            allDirectionsPrintPath(p + 'D', maze, r +1, c, path, step + 1);
        }

        if(c < maze[0].length -1){
            allDirectionsPrintPath(p + 'R', maze, r, c + 1, path, step + 1);
        }

        if(r > 0){
            allDirectionsPrintPath(p + 'U', maze, r -1, c, path, step + 1);
        }

        if(c > 0){
            allDirectionsPrintPath(p + 'L', maze, r , c -1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;

    }




    //6. all the paths from all the directions from can go up, down, left, right

    public static void allDirections(String p, boolean[][] maze, int r, int c){

        if(r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length -1){
            allDirections(p + 'D', maze, r +1, c);
        }

        if(c < maze[0].length -1){
            allDirections(p + 'R', maze, r, c + 1);
        }

        if(r > 0){
            allDirections(p + 'U', maze, r -1, c);
        }

        if(c > 0){
            allDirections(p + 'L', maze, r , c -1);
        }
        // this line is where function will be over
        // so before the function get remove also remove the changes made by that function.

        maze[r][c] = true;

    }


    //5. Maze with Obstacles

    public static void mazeWithObstacles(boolean maze[][],String p,  int r, int c){
        if(r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length -1){
            mazeWithObstacles(maze, p + 'D', r +1 ,c);
        }

        if(c < maze[0].length -1){
            mazeWithObstacles(maze, p + 'R', r, c +1);
        }
    }









//    public static void pathRestictions(String p, boolean[][] maze, int r, int c){
//        if(r == maze.length -1 && c == maze[0].length -1){
//            System.out.println(p);
//            return;
//        }
//
//        if(!maze[r][c]){
//            return;
//        }
//
//        if(r < maze.length -1){
//            pathRestictions(p + 'D', maze, r + 1, c);
//        }
//
//        if(c < maze[0].length -1){
//            pathRestictions(p + 'R', maze, r, c + 1);
//        }
//    }



    //4. you can go diagonal

    public static ArrayList<String> retPathMazeDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(retPathMazeDiagonal(p + 'D', r-1, c -1));
        }

        if(r > 1){
            list.addAll(retPathMazeDiagonal(p + 'V', r -1, c));
        }

        if(c > 1){
            list.addAll(retPathMazeDiagonal(p + 'H', r, c-1));
        }

        return list;
    }



    // 3. Return the list
    //Java creates a new String object. Nothing was modified. //Each call gets its own String.
    // So there is nothing to undo.So backtracking is not required here
    public static ArrayList<String> retPathMazeList(String p, int r, int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(retPathMazeList(p + 'D', r -1,c));
        }

       if(c > 1){
            list.addAll(retPathMazeList(p + 'R', r, c-1));
       }


       return list;
    }

//    public static ArrayList<String> retPathMaze(String p, int r, int c){
//        if(r == 1 && c == 1){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        ArrayList<String> list = new ArrayList<>();
//
//        if(r > 1){
//            list.addAll(retPathMaze(p + 'D', r -1, c));
//        }
//
//        if(c > 1){
//            list.addAll(retPathMaze(p + 'R', r, c-1));
//        }
//
//        return list;
//    }


    //2. Print the Path

//    public static void printPathMaze(String p, int r, int c){
//        if(r == 1 && c == 1){
//            System.out.println(p);
//            return;
//        }
//
//        if(r > 1){
//            printPathMaze(p + 'D', r -1, c);
//        }
//
//        if(c > 1){
//            printPathMaze(p + 'R', r, c-1);
//        }
  //  }


    public static void printPathMaze(String p, int r, int c){

        if(r == 1  && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            printPathMaze(p + 'D', r -1, c);
        }

        if(c > 1){
            printPathMaze(p + 'R', r, c-1);
        }

    }




    //1.  MAZE Problem Find the number of paths

    public static int findNumberPaths(int r, int c){

        if(r == 1 || c == 1){
            return 1;
        }

        int left = findNumberPaths(r-1, c);
        int right = findNumberPaths(r, c-1);

        return left + right;
    }


//    public static int findPath(int r, int c){
//        if(r == 1 || c == 1){
//            return 1;
//        }
//
//        int left = findPath(r-1, c);
//        int right = findPath(r, c-1);
//
//        return left + right;
//    }


    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

       // System.out.println(findPath(3,3));
      //  pathRestictions("",maze, 0, 0 );

       // System.out.println( retPathMazeList("", 3, 3));
        int[][] path = new int[maze.length][maze[0].length];
        allDirectionsPrintPath( "",maze, 0,  0, path, 1);
    }


}
