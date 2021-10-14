package com.company;

import java.util.Scanner;

public class Bank {

    // User starting cash amount
    static int[] cashAmount = {10000, 10000, 10000};

    public static void Purchase(int user, int buildingSite) {
        //Ask if the user/player want to buy a field
        //depending on the answer:
        //deduct User cashAmount, note user as owner of buildingSite
        //Printstatement

        if (Field.owner[buildingSite] == -1 ) {
            Scanner wouldBuy = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Would you buy " + Field.field[buildingSite] + " for the little amount of "
                    + Field.fieldPrice[buildingSite] + " dollars ?\nWrite Yes or No");
            String answer = wouldBuy.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                cashAmount[user] = cashAmount[user] - Field.fieldPrice[buildingSite]; //TODO rename
                Field.owner[buildingSite] = user;   //TODO rename
                System.out.println(AllUsers.userListe[user] + " have just bought " + Field.field[buildingSite] + " and welcome visitors");  //TODO rename

            } else {
                System.out.println("Just fine, I wish you good journey, and greetings to all my neighbours please");
            }
        }
        else{
            cashAmount[user] = cashAmount[user] - Field.fieldPrice[buildingSite];
            cashAmount[Field.owner[buildingSite]] = cashAmount[Field.owner[buildingSite]] +  Field.fieldPrice[buildingSite];
            System.out.println("You have paid the morgage!");
        }
        
    }
}

