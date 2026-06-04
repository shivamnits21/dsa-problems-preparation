package org.example.DSA.recursion;

import java.util.ArrayList;

public class RecursionArrayProblems {

    // Rotated binary search by recursion



    //4. Find the all element in the array and return the list(List outside the method), add the list in the parameter,
    //creting the arraylist inside the function

    // pass the create the list inside the method

    public static ArrayList<Integer> findAllElements3(int[] arr,int target, int index,ArrayList<Integer> list){

        if(index == arr.length -1){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllElements3(arr,target,index+1, list);
    }



    // pass the list in the arguments

    public static ArrayList<Integer> findAllElements2(int[] arr,int target, int index,ArrayList<Integer> list){

        if(index == arr.length -1){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllElements2(arr,target,index+1, list);
    }

     // creating the list outside.
     static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> findAllElements(int[] arr,int target, int index){

        if(index == arr.length -1){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllElements(arr,target,index+1);
    }


    //3. find the element in the array return the index

    public static int findElement(int[] arr,int target, int index){

        if(index == arr.length -1)
        {
            return - 1;
        }

        if(arr[index] == target) return index;

        return findElement(arr,target,index+1);

    }


    //2. Find the element in the array return true false

     public static boolean isElementPresent(int[] arr,int target, int index){

         if(index == arr.length -1)
         {
             return false;
         }

         return arr[index] == target || isElementPresent(arr,target,index+1);

     }


    //1. find if array is sorted

      public static boolean isSorted(int[] arr, int index){

          if(index == arr.length -1){
              return true;
          }

       return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
      }


    public static void main(String[] args) {

          int[] arr = {1,4,6,8,8,12,15,8,28,19};

        System.out.println(findAllElements2(arr,15, 0, new ArrayList<>()));
    }
}
