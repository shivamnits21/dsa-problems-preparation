package org.example.DSA.BitManipulation;

import org.apache.tomcat.util.modeler.FeatureInfo;

public class Bits {

    //12. XOR of numbers between a and b

    //11.Find XOR of number from 0-n.

    public static int xored0to1(int n){

        if(n %4 == 0) {
            return n;
        }else if(n % 4 == 1){
            return n;
        }else if(n % 4 == 2){
          return n+1;
        }
            return 0;

    }



    //10.Find the number of setbits in a number

    public static int numberOfSetbits(int n){
        int count = 0;

        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    //9.Calculate a^b

    //8.We've given the number find if it's power of 2 or not.

    public static boolean powerOf2(int n){

        if(n<= 0){
            return false;
        }

        return (n & (n-1)) == 0;
    }

    //7.Find the sum of nth row in Pascal's Triangle

    public static double sumNthRow(int n){
        return Math.pow(2, n-1);
    }

    //6.Find the nth magic number

   public static int nthMagicNumber(int n){
       int magicNumber = 0;
       int fifthPower = 1 ;
       while(n > 0){
           fifthPower = fifthPower*5;
           magicNumber = magicNumber + fifthPower*(n & 1);
           n = n>>1;

       }

       return magicNumber;
   }


    //5. in an array how to find the number that is appearing one time.

    public static int appearingOneTimeInArray(int[] arr){
        int xored = 0;
        for(int i = 0; i< arr.length; i++){
            xored ^= arr[i];
        }

        return xored;
    }



    // 4. find the position of the rightmost setbit(1) bit.

    public static void rightMostSetBit(int n){
        int count = 1;
        while(n>0){
                 if((n & 1) == 1){
                     System.out.println(count);
                     break;
                 }
                 count++;
                 n = n>>1;

             }
    }


    // 3. Reset the ith bit

    public static void reSetIBit(int n, int i){
        System.out.println((0 & (n >> i-1)));
    }


    //2. set the ith bit

    public static void setIBit(int n, int i){
        System.out.println((1 | (n>> i-1)));
    }

    // 1. find the ith bit of a number.
    public static int ibit(int n, int i){

        return 1 & (n>>i-1);
    }

    public static void main(String[] args) {

        //int n = 6;
        int[] arr = {2,4,6,8,9,2,6,3,4,9,8,7,7};
        System.out.println(numberOfSetbits(16));

    }
}
