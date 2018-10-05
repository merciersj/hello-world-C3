package com.codechallenge;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by merciersj on 8/29/2018.
 * Updated by LC on 9/26/2018
 */
public class HelloWorld {
    public static void main(String[] args) {
        performGame();
        System.out.println("Hello World");


    }

    public static void performGame(){
        boolean userWin = false;
        String[] names = {"lizard", "rock", "paper", "scissor", "spock"};
        Scanner input = new Scanner(System.in);


        while(!userWin)
        {
            Random num = new Random();
            int comp= num.nextInt(4);
            System.out.print("Enter rock, paper, scissor, lizard, or spock: ");
            String userChoice = input.nextLine();
            String computerChoice = names[4];
            if(userChoice.equals("lizard")){
                userWin = true;
            }
            else if(userChoice.equals("paper"))
            {
                userWin = true;
            }
            else{
                System.out.println("WRONG choice!");
            }

        }

    }
}
