package com.company;

public class Board {
    static int[] playerLocation = {0, 0, 0};
    static String[] playersNames= {"Test a","Test b","Test c"};

    public static void Start() {
        int i;

        while (playerLocation[0] <= 10 && playerLocation[1] <= 10 && playerLocation[2] <= 10) {

            for ( i = 0; i <= 2; i++) {

                int dice = Dice.RollResult(1); //Throw the dice
                //
                playerLocation[i] = playerLocation[i] + dice;//Move user x
                System.out.println(playersNames[i]  + " Stands on field " + playerLocation[i]);
                //
                Bank.Purchase(i, playerLocation[i]);//if location is owned = pay = if player goes minus = Game Over, Terminate the game
                //            ask if want to buy = yes =buy
                //continue to next player

                System.out.println("\n"+playersNames[0]+" cashammount "+Bank.cashAmount[0]+"\n"
                        +playersNames[1]+" cashammount "+Bank.cashAmount[1]+"\n"
                        +playersNames[2]+" cashammount "+Bank.cashAmount[2]+"\n");

            } i = 0;
        }
        System.out.println("The game is finish and the result is: ");
        System.out.println("\n"+playersNames[0]+" cashammount "+Bank.cashAmount[0]+"\n"
                +playersNames[1]+" cashammount "+Bank.cashAmount[1]+"\n"
                +playersNames[2]+" cashammount "+Bank.cashAmount[2]+"\n");
    }
}
