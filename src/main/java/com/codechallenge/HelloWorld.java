package com.codechallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
	public static void main(String[] args) {
		String h = "o";
		String l = "W";
		String e = "d";
		String r = "e";
		String o = "l";
		String W = "H";
		String d = "r";
		List<String> bannana = new ArrayList<String>();

		bannana.add(0, W);
		apple(W);
		apple(r);
		apple(o);
		apple(o);
		apple(h);
		apple(" ");
		apple(l);
		apple(h);
		apple(d);
		apple(o);
		apple(e);


	}

	public static String apple(String index) {
		Random shellfish = new Random();
		int n= shellfish.nextInt(50000)+1;
		while(n<50000){
			n= shellfish.nextInt(50000)+1;
		}
		System.out.print(index);
		return index;
	}
}