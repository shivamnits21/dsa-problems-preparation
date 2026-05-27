package org.example.DSA.SortingAlgorithms;

import java.util.Arrays;

public class Sorting {

    // 4. Cycle Sort

    public static void cycleSort(int[] arr){
        int i =0;

       while(i < arr.length){
           int correctIndex = arr[i] -1;
           if(arr[i] != arr[correctIndex]){
              swap(arr, arr[i], arr[correctIndex]);
           }
       }

    }


    //3. Insertion Sort

    public static void insertionSort(int[] arr){

        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

            }
        }
    }

    //2. Selection Sort

    public static void selectionSort(int[] arr){

        for(int i = 0; i< arr.length -1; i++){
            int k = i;
            for(int j = i + 1; j< arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }

            swap(arr,i, k);
//            int temp = arr[k];
//            arr[k] = arr[i];
//            arr[i] = temp;
        }

    }



    //1. bubble Sort
    //stable algorithm:  maintain the same order in sorted array as in original array.

     public static void bubbleSorting(int[] arr){

        for(int i = 0; i <  arr.length; i++){
            boolean flag = true;
            for(int j = 1; j < arr.length -i; j++){

                if(arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1 ];
                    arr[j -1] = temp;
                    flag = false;
                }
            }

            if(flag) return;

        }
     }


        public static  void swap(int[] arr, int a, int b){
            int temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;
        }


    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2,8,9,2,5,7,84,8,4,3,1,9};
        //selectionSort(arr);
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

}
