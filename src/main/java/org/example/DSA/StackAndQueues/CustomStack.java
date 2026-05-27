package org.example.DSA.StackAndQueues;

// We use Stack and queues when we want to store answers so far and put some results behind you to use them
// later and in binary tree traversals we heavily use stack and queues(BFS and DFS), when we convert recursion
// program to iteration we use stack and queue.
// if we are dealing with ordering like we are putting stuff in order and wanna back in order we use
// stack and queue, When we have something to do with sequences like answer till here use stack and queue.

//This monotonic stack pattern is used in many problems:
//        Next Greater Element
//        Next Smaller Element
//        Stock Span Problem
//        Largest Rectangle in Histogram
//        Daily Temperatures
//        Trapping Rain Water

//If the problem says:
//        Next greater element
//        Next smaller element
//        Previous greater element
//        Previous smaller element
//        ➡️ 90% chance the solution uses a monotonic stack

//Example problems:
//        Next Greater Element
//        Daily Temperatures
//        Stock Span

public class CustomStack {
    private int[] arr;
    int length;

    CustomStack(int n){
        arr = new int[n];
        length = -1;
    }

    public boolean isEmpty(){
        if(length == -1){
            return true;
        }

        return false;
    }

    public boolean isFull(){
        if(length >= arr.length - 1){
            return true;
        }
        return false;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full can't insert");
            return;
        }
        length++;
        arr[length] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty can't remove");
            return -1;
        }

        int x = arr[length--];
        return x;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[length];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }

        for(int i = 0; i <= length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(6);

        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(12);
        //System.out.println(stack);
        stack.display();
        System.out.println(stack.peek());

//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.push(12);
       // stack.display();
    }


}
