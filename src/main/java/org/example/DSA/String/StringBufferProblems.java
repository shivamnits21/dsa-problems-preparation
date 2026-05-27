package org.example.DSA.String;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;

import java.util.Arrays;
import java.util.Random;

//Theory
// StringBuffer: mutable sequence of characters
// advantage: Mutable, we can modify the object without creating the new Object and make changes in the previous object.
//2. efficient
// Thread safe: that's why it's slower then Stringbuilder cox stringbuilder is not thread safe it's faster
// when we need thread safety we use Stringbuffer otherwise we use StringBuilder.
public class StringBufferProblems {



    public static String randomString(int size){
      StringBuffer stringBuffer = new StringBuffer(size);
      Random random = new Random();

      for(int i = 0; i < size ; i++){
          int randomChar = 97 + (int)(random.nextFloat()*26);
          stringBuffer.append((char)randomChar);
      }

      return stringBuffer.toString();
    }

    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb = new StringBuffer();

        // constructor 2
        StringBuffer sb1 = new StringBuffer("Shivam Singh");

        //constructor 3
        StringBuffer sb3 = new StringBuffer(10);

        sb.append("Wemakedevs");
        sb.append(" is Nice");
        sb.insert(2, " Shivam "); // insert a string at index 2.
        sb.replace(1,8,"Singh"); // replace the String between the index
        sb.delete(1,8);


        System.out.println(sb.toString());

        int n = 20;

        System.out.println(randomString(20));


        // Remove whitespaces
        String sentence = "hi   gsh  dsho sd a     go    ";
        System.out.println(sentence.replaceAll("\\s", ""));

        //split: usee to conver the string into string array by the space

        String arr = "Shivam Kunal Aditya Hemendra";
        String[] names = arr.split(" ");       // will convert to [Shivam, Kunal, Aditya, Hemendra]
        System.out.println(Arrays.toString(names));

    }


}
