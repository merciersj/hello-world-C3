package com.codechallenge;

/**
 * Created by merciersj on 8/29/2018.
 */

public class HelloWorld {

    public static String shuffle(String arg){
        String result = "";
        for(int i = 0; i < arg.length(); i++){
            String character = arg.substring(i,i+1);
            result += character;
        }
        return result;
    }

    public static String reverse(String arg){
        String result = "";
        for(int i = arg.length() - 1; i >= 0; i--){
            String character = arg.substring(i,i+1);
            result += character;
        }
        return result;
    }

    public static String concat(String a, String b,String c, String d, String e, String f, String g,String h,
    String i,String j,String k,String l){
        String result = "";
        shuffle(a);
        reverse(a);
        shuffle(b);
        reverse(b);
        shuffle(c);
        reverse(c);
        shuffle(d);
        reverse(d);
        shuffle(e);
        reverse(e);
        shuffle(f);
        reverse(f);
        shuffle(g);
        reverse(g);
        shuffle(h);
        reverse(h);
        shuffle(i);
        reverse(i);
        shuffle(j);
        reverse(j);
        shuffle(k);
        reverse(k);
        shuffle(l);
        reverse(l);
        result+= a;
        result+= b;
        result+= c;
        result+= d;
        result+= e;
        result+= f;
        result+= g;
        result+= h;
        result+= i;
        result+= j;
        result+= k;
        result+= l;


        return result;
    }

    public static void main(String[] args){
        String str = "Hello World!";

        System.out.println(concat("H","e","l","l","o"," ","W","o","r","l","d","!"));
        //System.out.println("Hello World!");

    }
}