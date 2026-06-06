package org.example.DSA.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamInClass {





    public static void main(String[] args) {

         List<Integer> list = Arrays.asList(2, 4, 6, 12,46,83,22,765,346,32,7, 2, 5, 7, 8, 23, 354, 6 );

        //List<Integer> filterList =  list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
       List<Integer> filterList =  list.stream()
               .filter(n -> n % 2 == 0)
               .map(x -> x / 2)
               .distinct()
               .sorted((a, b) -> b -a)
               .limit(4)
               .skip(2)
               .collect(Collectors.toList());
       // List<Integer> newList = filterList.stream().map(x -> x / 2).collect(Collectors.toList());
        //System.out.println(filterList);



        Stream.iterate(0, x -> x+1)
                .limit(101)
                .map(x -> x / 10)
                .distinct()
                .peek(System.out:: println)
                .max((a,b) -> a -b)
                //.peek(System.out:: println)
                .get();

           //System.out.println(collect);
    }
}
