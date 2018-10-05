package com.codechallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by merciersj on 8/29/2018.
 * Edited by James Baker on 9/26/2018
 */
public class HelloWorld {
    public static void main(String[] args) {
        char a = 'H';
        char b = 'e';
        char c = 'l';
        char j = 'o';
        char k = 'r';
        char z = 'l';
        char x = 'd';
        char d = 'l';
        char e = 'o';
        char f = ' ';
        char i = 'W';

        Map<Character, Character> bye = new HashMap<Character, Character>();
        bye.put(a,a);
        bye.put(b,b);
        bye.put(c,c);
        bye.put(d,d);
        bye.put(e,e);
        bye.put(f,f);
        bye.put(i,i);
        bye.put(j,j);
        bye.put(k,k);
        bye.put(z,z);
        bye.put(x,x);

        if(bye.get(a) == 'H'){
            System.out.print(bye.get(a));
        }
        if(bye.get(b) == 'e'){
            System.out.print(bye.get(b));
        }
        if(bye.get(c) == 'l'){
            System.out.print(bye.get(c));
        }
        if(bye.get(d) == 'l'){
            System.out.print(bye.get(d));
        }
        if(bye.get(e) == 'o'){
            System.out.print(bye.get(e));
        }
        if(bye.get(f) == ' '){
            System.out.print(bye.get(f));
        }
        if(bye.get(i) == 'W'){
            System.out.print(bye.get(i));
        }
        if(bye.get(j) == 'o'){
            System.out.print(bye.get(j));
        }
        if(bye.get(k) == 'r'){
            System.out.print(bye.get(k));
        }
        if(bye.get(z) == 'l'){
            System.out.print(bye.get(z));
        }
        if(bye.get(x) == 'd'){
            System.out.print(bye.get(x));
        }

        System.out.println("");

    }
}
