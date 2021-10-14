package com.company;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static int RollResult(int rollResult) {
        System.out.println("Do you want to roll the dice?");
        System.out.println("[type yes to roll]");
        Scanner roll = new Scanner(System.in);
        String yesToRoll = roll.nextLine();
        int test;
        if (yesToRoll.equalsIgnoreCase("yes")) {
            Random r = new Random();

            int result = 0;
            result = r.nextInt(6);
            result++;

            System.out.println("You rolled a: " + result);
            return result;
        }
        else {
            System.out.println("Dude, you need to roll");
            return 0;
        }

    }
}