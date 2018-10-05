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
        for (int i = 0; i < input.length(); i++) {
            char j = input.charAt(i);
            charList.add(j);
        }
        List<Character> result = new ArrayList<Character>();

        int h = 72;
        int e = 101;
        int l = 108;
        int o = 111;
        int space = 32;
        int w = 87;
        int r = 114;
        int d = 100;
        int exclamation = 33;

        for (char c : charList) {
            int k1 = 0;
            if (c == 'H') {
                while (k1 < h) {
                    k1 += 1;
                }

                char tmp = (char) k1;
                result.add(tmp);
            }
            if (c == 'e') {
                int k2 = 0;
                while (k2 < e) {
                    k2 += 1;
                }
                char tmp = (char) k2;
                result.add(tmp);
            }
            if (c == 'l') {
                int k3 = 0;
                while (k3 < l) {
                    k3 += 1;
                }
                char tmp = (char) k3;
                result.add(tmp);
            }

            if (c == 'o') {
                int k5 = 0;
                while (k5 < o) {
                    k5 += 1;
                }
                char tmp = (char) k5;
                result.add(tmp);
            }
            if (c == ' ') {
                int k6 = 0;
                while (k6 < space) {
                    k6 += 1;
                }
                char tmp = (char) k6;
                result.add(tmp);
            }
            if (c == 'W') {
                int k7 = 0;
                while (k7 < w) {
                    k7 += 1;
                }
                char tmp = (char) k7;
                result.add(tmp);
            }

            if (c == 'r') {
                int k9 = 0;
                while (k9 < r) {
                    k9 += 1;
                }
                char tmp = (char) k9;
                result.add(tmp);
            }

            if (c == 'd') {
                int k11 = 0;
                while (k11 < d) {
                    k11 += 1;
                }
                char tmp = (char) k11;
                result.add(tmp);
            }
            if (c == '!') {
                int k12 = 0;
                while (k12 < exclamation) {
                    k12 += 1;
                }
                char tmp = (char) k12;
                result.add(tmp);
            }
        }
        String result1 = "";
        for (char r1 : result){
        result1 += r1;
    }

        System.out.println(result1 + '!');
    }
}
