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

        for(char c: charList) {
            int k1 = 0;
            while (k1 < h) {
                k1 += 1;
            }

            int k2 = 0;
            while (k2 < e) {
                k2 += 1;
            }

            int k3 = 0;
            while (k3 < l) {
                k3 += 1;
            }

            int k4 = 0;
            while (k4 < l) {
                k4 += 1;
            }

            int k5 = 0;
            while (k5 < o) {
                k5 += 1;
            }

            int k6 = 0;
            while (k6 < space) {
                k6 += 1;
            }

            int k7 = 0;
            while (k7 < w) {
                k7 += 1;
            }

            int k8 = 0;
            while (k8 < o) {
                k8 += 1;
            }

            int k9 = 0;
            while (k9 < r) {
                k9 += 1;
            }

            int k10 = 0;
            while (k10 < l) {
                k10 += 1;
            }

            int k11 = 0;
            while (k11 < d) {
                k11 += 1;
            }

            int k12 = 0;
            while (k12 < exclamation) {
                k12 += 1;
            }

        }
        System.out.println("Hello World");
    }
}
