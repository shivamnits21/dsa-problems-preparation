package org.example.DSA.recursion;

import java.util.ArrayList;
import java.util.Arrays;

//lectures to revise: 11, 13

public class RecursionStriver {

    //16. All permutations of String/Array


    //15. Leetcode: https://leetcode.com/problems/subsets-ii/description/?envType=problem-list-v2&envId=backtracking


    //14.All the subset sum problem



    //13. combination sum 2


    //12. https://leetcode.com/problems/combination-sum/submissions/1767051219/


    //11. count the subsequences with sum = k.


    //10. print only one subsequence whose sum is equal to target.


    //9. subsequences whose sum is equal to target in array [1,2,3]




    //8. print subsequence of array given [1,2,3]

    public static void subseQuenceSum(int[] p, int[] up, int index){

        if(index == up.length -1){
            System.out.println(Arrays.toString(p));
            return;
        }

        subseQuenceSum(p, up, index + 1);
        subseQuenceSum(p, up, index + 1);
    }


    //7. print all the subsequences

    public static ArrayList<String> retSubse(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);

        ArrayList<String> left = retSubse(p + c, up.substring(1));
        ArrayList<String>  right = retSubse(p , up.substring(1));

        left.addAll(right);

        return left;

    }

    public static void printSubse(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char  c = up.charAt(0);
        printSubse(p + c, up.substring(1));
        printSubse(p, up.substring(1));

    }


    //6. Fibonacci Number

    public static int fibonacci(int n){

        if(n < 2){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }


    //5. check if string is palindrome or not

    public static boolean isPalindrome(String s, int start, int end){

        if(start > end){
            return true;
        }

        return s.charAt(start) == s.charAt(end) &&  isPalindrome(s, start + 1, end-1);
    }



    //4. reverse an array

    public static void reverseArray(int[] arr, int start, int end){

        if(start > end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end -1);
    }


    // 3. factorial of a number

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        return n * factorial(n-1);
    }



  // 2. sum of first n numbers


    public static int sumN2(int n){

        if(n == 0) {
            return 0;
        }
        return n + sumN2(n-1);
    }
    public static int sumN(int n, int sum){

        if(n == 0){
            return sum;
        }
        return sumN(n-1,sum + n);
    }



    //1. print name n times

     public static void printName(int n){
        if(n == 0){
            return;
        }

         System.out.println("Shivam");
        printName(n - 1);
     }

    public static void main(String[] args) {
      //  int[] arr = { 3, 5,7,2,7,4};

        //String s = "abccba";
        System.out.println(retSubse("", "abc"));

        //printSubse("", "abc");
    }
}
