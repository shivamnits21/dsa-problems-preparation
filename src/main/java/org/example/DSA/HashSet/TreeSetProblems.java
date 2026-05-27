package org.example.DSA.HashSet;

//What is TreeSet?
//TreeSet is a class in Java that:

        //1. Stores unique elements (like HashSet)
        //2. But keeps them sorted automatically

//Internally (VERY IMPORTANT)

        //1.TreeSet is based on:
        //2.Red-Black Tree (Self-balancing BST)

//So:
       // ✅ It is tree-based, not hashing
       // ❌ Not related to HashSet internally

// Comparison: HashSet vs TreeSet
//        Feature	                HashSet ❌	     TreeSet ✅
//        Order	                    No order  	     Sorted order
//        Internal DS	            Hash Table	     Red-Black Tree
//        Duplicate allowed	          ❌	             ❌
//        Search time	                O(1)	        O(log n)
//        Range queries             	❌              	✅


//⚡ Time Complexity
//        Operation	Complexity
//        add()	: O(log n)
//        remove(): 	O(log n)
//        contains(): 	O(log n)
//        lower()/higher(): 	O(log n)


//1. lower(x)
//
//        👉 greatest element < x
//
//2. higher(x)
//
//        👉 smallest element > x
//
//        3. floor(x)
//
//        👉 greatest element ≤ x
//
//        4. ceiling(x)
//
//        👉 smallest element ≥ x

public class TreeSetProblems {
}
