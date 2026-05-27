package org.example.DSA.SearchingAlgorithms;

import java.util.ArrayList;

public class BinarySearch{

    //4. find the position of an element in sorted array of infinite elements.

    public static int findInInfiniteArray(int[] arr, int target){

        int start = 0;
        int end = 1;


        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        while(start <= end){

            int mid = start + (end - start)/2;


            if(target == arr[mid]){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }


    //3. Find the floor of target element

    public static int findFloorElement(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return arr[end];
    }

    // 2. find the Ceiling of target element

    public static int findCeilingElement(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return arr[start];
    }



    //1. Binary Search Algorithm

    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> findTwoElement(int arr[]) {

        int j = 0;

        while(j < arr.length){
            int correctIndex = arr[j] -1;

            if(arr[j] != arr[correctIndex]){
                int temp = arr[j];
                arr[j] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                j++;
            }

        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length; i++){

            if(arr[i] != i+1){
                list.add(arr[i]);
                list.add(i+1);
            }
        }

        return list;

    }


    public static int binarySearchR(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
             int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2};


        System.out.println(findTwoElement(arr));

    }
}





