package org.example.DSA.String;

public class StringBuilderProblems {


    public static void main(String[] args) {

       // String name = "Shivam Singh";
        StringBuilder sb = new StringBuilder(10);

//        for(int i = 0; i < name.length(); i++){
//            sb.append(name.charAt(i));
//        }

        for(int i = 0; i < 26; i++){
            sb.append((char)('a'+ i));
        }
        // this code will create only one object and make the changes in that object only so the time
        // complexity will be O(N).







        //sb.insert(5, 's');

//        for(int i = 0; i < 26; i++){
//         char ch = (char) ('a' + i);
//            sb.append(ch + " ");
//        }

        System.out.println(sb.toString());
    }




}
