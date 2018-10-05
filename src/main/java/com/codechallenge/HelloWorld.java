package com.codechallenge;
import java.sql.Time;
import java.util.Scanner;

/**
 * Created by merciersj on 8/29/2018.
 * Commented by LukeC
 */


public class HelloWorld {

    static int _curreENTRandom;
    static Scanner _input;
    static int _userInput;
    static boolean solved = false;

    {
        _input = new Scanner(System.in);
    }


    public static void main(String[] args) {

        while (true) {
            _doTheThing();

        }


    }

    private static void _doTheThing() {
        _curreENTRandom = (int)Math.random();
         _curreENTRandom=_curreENTRandom%10;
          System.out.println("what is the square of :" + _curreENTRandom);
          _userInput = _input.nextInt();
          _curreENTRandom *= _curreENTRandom;
          if(solved){
              System.out.println("World");
              return;
          }
          if(_userInput == _curreENTRandom){
              System.out.println("hello ");
              solved = true;
          }
          else
          {

              System.out.println("Try again");
          }

    }
}
