package org.example.DSA.recursion;



import java.util.ArrayList;
import java.util.List;

public class RecursionProblems {

    public static  int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {  // at most 60 because 2^60 fits in range
            long target = (long) num1 - (long) k * num2;
            if (target < k) continue; // can't form sum if target < k
            int bitCount = Long.bitCount(target);
            if (bitCount <= k) return k; // possible with k operations
        }
        return -1;
    }

    // Subset, Subsequences

    // 1. remove a from the String bccacacd

    public static String removeChar(String unp){

        if(unp == ""){
            return "";
        }

        char ch = unp.charAt(0);

        if(ch == 'a'){
            return removeChar(unp.substring(1));
        }else{
            return  ch + removeChar(unp.substring(1));
        }

    }
    public static void removeChar(String p, String unp){

        if(unp == ""){
            System.out.println(p);
            return;
        }

        char ch = unp.charAt(0);

        if(ch == 'a'){
            removeChar(p, unp.substring(1));
        }else{
            removeChar(p + ch,unp.substring(1));
        }

    }


    // Recursion in Arrays problems

    // 4. return the list of index of target element

    public static List<Integer> targetElement(int[] arr, int index, int target, List<Integer> list){
        if(index == arr.length -1 ){
            return list;
        }

        if(arr[index] == target){
             list.add(index);
        }

        return targetElement(arr, index + 1, target, list);
    }

    // 3. find index the index of target element

    public static int findIndex(int[] arr, int target, int index){

        if(index == arr.length -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return findIndex(arr, target, index +1);
    }

    //2. find the target element

    public static boolean findTarget(int[] arr, int target, int index){
        if(index == arr.length -1){
            return false;
        }

        return arr[index] == target || findTarget(arr, target, index + 1);
    }

    // 1.Find if array is sorted or not


    public static boolean isSorted(int[] num,int index){

        if(index == num.length - 1 ){
            return true;
        }

        return num[index] < num[index + 1] && isSorted(num,  index+1);

    }





    // Recursion Basic Problems

    // counter zeros in a number by recursion

    public static int countZerosRec(int n, int count){
        if( n == 0){
            return count;
        }
        if(n % 10 == 0){
            return countZerosRec(n / 10, count+1);
        }else{
            return countZerosRec(n / 10, count);
        }

    }

    //  count number of zeros in a number
        public static int countZeros(int n){
    int count = 0;
    while(n > 0){
        if(n % 10 == 0){
            count++;
        }
        n = n / 10;
    }
    return count;
}


    // is Numbere palindrome or not


    // Reverse number

    public static int reverseNumber(int n){
        int count = 0;
        int x = n;
        while(x > 0){
            x = x / 10;
            count++;
        }
        int number = 0;

        while(n > 0){
            int rem = n % 10;
            number += rem * Math.pow(10, count -1);
            n = n/10;
            count--;
        }

        return number;
    }

    // sum of digits by Recursive method
    public static int sumDigitRec(int n){

        if( n == 0){
            return 0;
        }

        return n % 10 + sumDigitRec(n / 10);
    }


    // sum of digits by iterative method

    public static int sumDigitIte( int n){
       int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n = n /10;
        }

        return sum;
    }

    // factorial of a number

    public static int factorial(int n){
        if( n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void printNumbers(int n){

        if(n == 0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }

    // print numbers in reverse by Recursion
    public static void Nto1(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
        Nto1(n-1);
    }



    public static void main(String[] args) {

        int result = makeTheIntegerZero(5,7);
        System.out.println(result);



    }
}
