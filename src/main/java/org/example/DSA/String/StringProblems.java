package org.example.DSA.String;

import org.apache.tomcat.util.buf.Ascii;

import java.util.ArrayList;
import java.util.Arrays;

// For optimisation purpose they have string pool so that many reference variables can point to the same
// like a = "Shivam" and b = "Shivam", both are pointing to the same object.
//KMP is a very important string algorithm that helps avoid the slow O(n²) substring search.
//KMP = Knuth–Morris–Pratt algorithm
//
//It is a string pattern matching algorithm used to find whether a pattern exists inside another string efficiently.
//text = "abcdabcd"
//pattern = "cdab"
//Instead of restarting the comparison every time a mismatch happens, KMP reuses previous comparison information.

public class StringProblems {


    public static void main(String[] args) {

        String name1 = "Shivam";
        String name2 = "Shivam";
        System.out.println(name1 == name2); // Provide the output to be true coz reference variable name1
        // and reference variable name2 both are pointing to the same object that is Shivam in string Pool
        // name1 name2 -> shivam, if name1 -> Shivam, name2 -> Shivam Output will be false coz it check for 
        // both reference variable and the values in this case in string pool both name1 and name2 pointing to
        // same object So we create different object with the same value by using the new Keyword like
        // String a = new String("Shivam"), String b = new String("Shivam"), a -> Shivam, b->Shivam so by new keyword
        // it creates the object outside the string pool but in heap So when we need to check only for values
        // use .equals method.
        // char[] chars = s.toCharArray();
        // convert any string to character  array and (return new String(chars)) will return the string first convert
        // character of array to String and return the string.

//        /*String a = "Shivam";
//        String b = "Shivam";
//        System.out.println(a == b); // it provide the output to be true coz, a is reference variable
         //pointing to object Shivam and b is a reference variable pointing to "Shivam" and both reference
        // variables are different.
//        System.out.println(a.equals(b)); // Give the output to be true, So by using == and .equals we can check like
        // two different reference variables are pointing to the same object or different object.
//
//        String name1 = new String("Shivam");
//        String name2 = new String("Shivam");
//
//        System.out.println(name1 == name2);
//        System.out.println(name1.equals(name2));*/


//        System.out.println('a' + 'b');
//        // return ASCII value
//        System.out.println("a" + "b");
//        // return ab as string concanated
//        System.out.println('a' + 0);
//        // return ASCII value, character converted to ASCII value
//        System.out.println('a' + "a");
//        // concanate the string with characted
//        System.out.println((char)('a' + 3));
//        // typecasting the characted so the ASCII value converted to characted
//        System.out.println("a" + 1);
//        //integer will be converted to Integer that will call toString() method.
//
//        System.out.println("Shivam" + new ArrayList<>());
//        System.out.println("Shivam" + new Integer(56));
//           String series = "";
//           for(int i = 0; i < 26 ; i++){
//               series = series + (char)('a' + i);
//           }
//
//           System.out.println(series);
        // for the above code new object of string will be created copy the old one and appending the
        // the new changes and old ones are dereferenced wasting the lots of memory. So the time complexity
        // will be O(n^2). coz a,ab, abc, abcd, 1 + 2+ 3+ 4 dereferenced O(n^2).so the solution for this problem
        // we have stringBuilder only one object is created and we changes in that object only reference is also
        // the same not change.

        // Methods

        //String name = "Shivam Singh";
//        Arrays.toString(name.toCharArray());
//        System.out.println(Arrays.toString(name.toCharArray())); // convert the string into character array Arrays.toString print the array.
        //System.out.println(name[0]);
//        System.out.println(name.toLowerCase());
//        System.out.println(name);
//        System.out.println(name.trim());
//        System.out.println(name.strip());
        // remove the whitespaces before and after the string
//        System.out.println(Arrays.toString(name.split(" ")));
         // returns the Array that's why we used Arrays.toString() to convert it into the string " " is the regex
//
//        System.out.println(name.replace(".", "[.]"));

        // int num = Integer.parseInt(substring(i -2, i)) // i -2 is iniclusive and i is exclusive


       // System.out.println(name.replace(name.charAt(5), name.charAt(9)));

        System.out.println((char)('A' - 1 )); // 65 - 90
        System.out.println('z' + 0);   // 97 - 122
        System.out.println('a' - 'c');

        System.out.println((char)('a' + 10));
        //System.out.println((char)('a' + 96));
        System.out.println('2' - '0');
        // convert the character into the integer
        // ASCII value of c will be subctracted from a result is -2

        // s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // ^ means not, here it means any character that is not A-Za-z0-9 should be replaced by empty String.
         // if we want lowerCase character is hould be like this Character.toLowerCase(s.charAt(i)) and if we
        // want string to be lower case it should be like this s.toLowerCase().

        // contains() → looks for contiguous sequence of characters.
//        "hello".contains("ell")   → true   // contiguous substring
//        "hello".contains("elo")   → false  // 'e' and 'l' and 'o' exist but not together
//        "abcdef".contains("abc")  → true
//        "abcdef".contains("acf")  → false

        String name = "  Shivam Singh gonna be best  ";
        name.strip();
        System.out.println(name);

        System.out.println(('Z' - 'a'));

        // Set<Character> set = new LinkedHashSet<>();
        // preserve the order and HashSet does not preserve insertion order. It stores elements in a way that optimizes lookup time (using hash codes), not order.
        // So when you iterate over it in the elements may appear in random or unpredictable order,
        // depending on their hash values.


    }
}
