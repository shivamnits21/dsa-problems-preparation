package org.example.DSA.recursion;

import java.util.Arrays;

public class RecursionStriver {

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
        System.out.println(fibonacci(6));
    }
}
