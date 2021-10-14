package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        AllUsers All = new AllUsers();

        AllUsers.userListe[0] = user1;
        AllUsers.userListe[1] = user2;
        AllUsers.userListe[2] = user3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username Player 1: ");
        AllUsers.userListe[0].navn = scanner.nextLine();

        System.out.print("Username Player 2: ");
        AllUsers.userListe[1].navn = scanner.nextLine();

        System.out.print("Username Player 3: ");
        AllUsers.userListe[2].navn = scanner.nextLine();

        Board.playersNames[0]= String.valueOf(AllUsers.userListe[0]);
        Board.playersNames[1]= String.valueOf(AllUsers.userListe[1]);
        Board.playersNames[2]= String.valueOf(AllUsers.userListe[2]);


        System.out.println("Player 1 is: " + AllUsers.userListe[0]);
        System.out.println("Player 2 is: " + AllUsers.userListe[1]);
        System.out.println("Player 3 is: " + AllUsers.userListe[2]);

        Board.Start();
        //Bank.Purchase(0,1);


    }
}