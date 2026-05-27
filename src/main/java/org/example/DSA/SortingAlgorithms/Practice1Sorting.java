package org.example.DSA.SortingAlgorithms;

import java.util.Arrays;

public class Practice1Sorting {

    //6. Radix Sort

    public static void radixSort(int[] arr){

    }


    //5. count sort: find largest element in the array, then create the frequency array
    // 1. non- comparison sorting algorithm
    //2. Good for small numbers
    //3. it's stable algorithm


    public static void countSort(int[] arr){   // O(N)
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] freq = new int[max + 1];

        for(int i  = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
         int index = 0;

        for(int i = 0; i < freq.length; i++){

            while(freq[i] > 0){
                arr[index] = i;
                index++;
                freq[i]--;
            }
        }
    }

    //4. Cyclic Sort: when  from 1 to N numbers are give

    public static void cyclicSort(int[] arr){
        int i = 0;
        while( i < arr.length){
            int correctIndex = arr[i] - 1;

            if(arr[i] != i + 1){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
    }






    //2. Selection Sort                Selection Sort is a comparison-based sorting algorithm.
    // It sorts by repeatedly selecting the smallest (or largest) element from the unsorted portion
    // and swapping it with the first unsorted element.
    //Find the smallest element and swap it with the first element. This way we get the smallest element at its correct position.
    //Then find the smallest among remaining elements (or second smallest) and swap it with the second element.
    //We keep doing this until we get all elements moved to correct position.

  // this algorithm is not stable.
    public static void selectionSorting(int[] arr) {
        int i = arr.length - 1;
        while (i >= 0) {
            int k = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[k] ) {
                       k = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;

            i--;

        }
    }


    // why use: steps reduce if array is sorted, number of steps reduce as compared to bubble
    // used for smaller values of n, works good if array is partially sorted that's why it takes part in
    // hybrid sorting algorithms.
    //it's stable.
    // works well with small data

    public static void insertionSort(int[] arr){

        for(int i = 0 ; i < arr.length - 2; i++){
         int j = i+1;
          while(j > 0){

              if(arr[j] < arr[j -1]){
                  int temp = arr[j -1];
                  arr[j -1] = arr[j];
                  arr[j] = temp;
              }else{
                  break;
              }
              j--;

            }
        }
    }



    //1. bubble sort


    public static void bubbleSort(int[] arr){

        for(int i = 0; i < arr.length -1 ;i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length -i - 1; j++){

                if(arr[j] > arr[j + 1]){
                   int temp = arr[j + 1];
                   arr[j + 1] = arr[j];
                   arr[j] = temp;
                   swapped = true;
                }
            }

            if(!swapped){
                return;
            }
        }




    }





    public static void main(String[] args) {

        //int[] arr = {4,3,5,8,6,9,12,86,3,46,6,2,75,72,7,547,2477,684,3,6634,756,83,65426};
          int[] arr= {5,3,2,1,4,6,9,8,7};
       // bubbleSort(arr);
        countSort(arr);

        System.out.println(Arrays.toString(arr));

//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

    }
}
