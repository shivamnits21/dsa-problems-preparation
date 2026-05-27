package org.example.DSA.HashSet;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import java.util.HashSet;
import java.util.Iterator;

//why important
//1. Inser/Add : O(1)
//2. Search/Contains:O(1)
// 3. Delete/ Remove : O(1)

//This class implements the Set interface, backed by a hash table (actually a HashMap instance).
// It makes no guarantees as to the iteration order of the set; in particular,
// it does not guarantee that the order will remain constant over time. This class permits the null element.
// class offers constant time performance for the basic operations (add, remove, contains and size),

//Note that this implementation is not synchronized. If multiple threads access a hash set concurrently,
// and at least one of the threads modifies the set, it must be synchronized externally.
// This is typically accomplished by synchronizing on some object that naturally encapsulates the set.
// If no such object exists, the set should be "wrapped" using the Collections.synchronizedSet method.
// This is best done at creation time, to prevent accidental unsynchronized access to the set:
//        Set s = Collections.synchronizedSet(new HashSet(...));
//        The iterators returned by this class's iterator method are fail-fast:
//        if the set is modified at any time after the iterator is created, in any way except through the iterator's own remove method,
//        the Iterator throws a ConcurrentModificationException. Thus, in the face of concurrent modification,
//        the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future.
//        Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally speaking,
//        impossible to make any hard guarantees in the presence of unsynchronized concurrent modification.
//        Fail-fast iterators throw ConcurrentModificationException on a best-effort basis.
//        Therefore, it would be wrong to write a program that depended on this exception for its correctness:
//        the fail-fast behavior of iterators should be used only to detect bugs.
public class HashSetProblems {


    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //set.remove(1);

        //Iterator

        Iterator it = set.iterator();
        //Hashnext() return true or false , Next(): return the next value, 1- 2 - 3;
        for(int i = 0; i < set.size(); i++){
            System.out.println(it.next());
        }

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
