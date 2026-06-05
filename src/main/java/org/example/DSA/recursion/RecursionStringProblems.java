package org.example.DSA.recursion;

public class RecursionStringProblems {


    // return the list of subsets and ascii


    // return thr list of subsets


    //5. Subsets: non adjament collection



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

    public static void skip(String up){

    }



    public static void main(String[] args) {

        String up = "bccadappleappc";

        System.out.println(skipApp("", up));

    }

}
