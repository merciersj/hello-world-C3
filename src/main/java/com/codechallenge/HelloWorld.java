package com.codechallenge;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by merciersj on 8/29/2018.
 * Updated by LC on 9/26/2018
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");


    }

    public static boolean performGame(){
        boolean userWin;
        String[] names = {"lizard", "rock", "paper", "scissor", "spock"}
        Scanner input = new Scanner(System.in);

        while(input.nextLine())
        {
            Random num = new Random();
            int comp= num.nextInt(4);
            System.out.print("Enter rock, paper, scissor, lizard, or spock: ");
            String choice = input.nextLine();

        }

    }
}
