package org.example.DSA.recursion;

public class RecursionBasics {


    // 9. concept

    public static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        concept(--n);
        //n -- vs --n
        //n--: pass the value first then subtract
        //--n: subtract first then pass the value
    }



    //8. print   1toN

    public static void oneToN(int n){
        if(n == 0){
            return;
        }

        oneToN(n-1);
        System.out.println(n);
    }



    //7. print Nto1

    public static void Nto1(int n ){
        if(n ==0 ){
            return;
        }

        System.out.println(n);
        Nto1(n-1);
    }




    //6. count numberOfZeros

    public static int countZeros(int n, int count){
        if( n == 0){
            return count;
        }

        if((n % 10) == 0){
            count++;
        }

        return countZeros(n/10, count);
    }



    //5. Reverse Digit by Recursion

    public static int reverseDigits(int n){

        if(n == 1){
            return 1;
        }

        return  (n % 10)*10 + reverseDigits(n/10);

    }



    //4.  sum of Digits

    public static int sumOfDigits(int n){

        if ( n == 0){
            return 0;
        }

        return (n % 10) + sumOfDigits(n/10);
    }




    //3. Factorial of a number

     public static int factorial(int n){

         if(n == 1){
             return 1;
         }

         return n * factorial(n-1);

     }


    //2. Binary Search

    public static int binarySearch(int[] arr, int target, int s , int e){

        if(s > e){
            return -1;
        }

        int mid = s + (e - s)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return binarySearch(arr, target, s, mid - 1);
        }else{
            return binarySearch(arr, target, mid + 1, e);
        }
    }



    // 1. Nth Fobonacci number
    public static int findNthFibo(int n){

        if(n < 2){
            return n;
        }

        return findNthFibo(n - 1) +  findNthFibo(n - 2);

    }

    public static void main(String[] args) {

        int[] arr = {1,5,8,12,15,18,19,28,29};
        System.out.println(reverseDigits(1824));
    }


}
