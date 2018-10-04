package com.codechallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
    static String HiThere ="";
   static  List<H> list =  new ArrayList<>();
    public static void main(String[] args) {
        int count = 0;
        H h =new H();
        E e =new E();
        L l =new L();
        O o =new O();
        W w =new W();
        R r =new R();
        D d =new D();
        list.add(h);
        list.add(e);
        list.add(l);
        list.add(l);
        list.add(o);
        list.add(w);
        list.add(o);
        list.add(r);
        list.add(l);
        list.add(d);

        for (H obj :list) {
            String cl = obj.GetClassLetter();
            obj.MakeMap();
            if(count == 5 ){
                HiThere +=" ";
            }
            HiThere += obj.getLetter(cl);
                count ++;
        }




        System.out.println(HiThere);
    }
}
