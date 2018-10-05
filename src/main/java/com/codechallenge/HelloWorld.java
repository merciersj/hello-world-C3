package com.codechallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
    public static void main(String[] args) {
        String input = "Hello World";
        List<Character> charList = new ArrayList<Character>();
        for (int i = 0; i < input.length(); i++){
            char j = input.charAt(i);
            charList.add(j);
        }
        int H = 72;
        int e = 101;
        int l = 108;


        System.out.println("Hello World");
    }
}
