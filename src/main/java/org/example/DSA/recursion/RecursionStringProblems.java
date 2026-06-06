package org.example.DSA.recursion;

import java.util.ArrayList;

public class RecursionStringProblems {


    // return the list of subsets and ascii


    //7. return thr list of subsets, pass thelist in the argumentns

    public static ArrayList<String> subsets2(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsets2(p + ch, up.substring(1));
        ArrayList<String> right = subsets2(p,up.substring(1));
        left.addAll(right);
        return left;
    }


    // 6. return thr list of subsets, pass thelist in the argumentns

    public static ArrayList<String> subsets1(String p, String up, ArrayList<String> list){

        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
         subsets1(p + ch, up.substring(1), list);
         subsets1(p,up.substring(1), list);

       return list;
    }


    //5. Subsets: non adjament collection, print all the subsets

    public static void subsets(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p + ch, up.substring(1));
        subsets(p,up.substring(1));

    }





    // 4. skip app not apple

    public static String skipApp(String p , String up){
        if(up.isEmpty()){
            return p;
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipApp(p, up.substring(3));
        }else{
            return skipApp(p + up.charAt(0), up.substring(1));
        }
    }


    //3. skip apple like skip the word.

    public static String skipApple(String p , String up){
        if(up.isEmpty()){
            return p;
        }

        if(up.startsWith("app")){
            return skipApple(p, up.substring(5));
        }else{
            return skipApple(p + up.charAt(0), up.substring(1));
        }
    }


    //2. below question by returning the value.
    public static String skip2(String p, String up){

        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip2(p, up.substring(1));
        }else{
            return skip2(ch + p, up.substring(1));
        }

    }


    //1. skip the character in the string, like remove all the a from the string bccaddabasd

    public static void skip(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
             skip(p, up.substring(1));
        }else{
             skip(ch + p, up.substring(1));
        }

    }



    public static void main(String[] args) {

        String up = "abc";

        System.out.println(subsets2("", up));

    }

}
