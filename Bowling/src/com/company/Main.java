package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner key = new Scanner(System.in);

        int numPlayers = 0;
        int frstThrow;
        int scndThrow;
        int thrdThrow;
        boolean tenthFrame = false;
        ArrayList<Integer> Score = new ArrayList<Integer>();


        System.out.println("Lets go Bowling");
        System.out.print("How many players: ");
        numPlayers = key.nextInt();


    for (int p = 0; 0 <numPlayers; p++){
        for(int i =0; i <9; i++){
            System.out.println("Press enter to bowl");
            key.next();
            frstThrow = (int)Math.random()* (10-0);

            if (frstThrow < 10){
                System.out.println("You hit " + frstThrow + " pins!");
                System.out.println("Press Enter to roll again");
                key.next();
                scndThrow = (int)Math.random()* (frstThrow -0);

                if ((scndThrow + frstThrow) == 10){
                    System.out.println("You got a Spare!");

                }

            }else {
                System.out.println("You got a strike");
            }

        }

        while (tenthFrame = false ) {
            System.out.println("Press Enter to bowl");
            key.next();
            frstThrow = (int) Math.random() * (10 - 0);

            if (frstThrow < 10) {
                System.out.println("You hit " + frstThrow + " pins!");
                System.out.println("Press Enter to roll again.");
                key.next();
                scndThrow = (int) Math.random() * (frstThrow - 0);

                if ((scndThrow + frstThrow) == 10) {
                    System.out.println("You got a Spare!");
                    System.out.println("Press Enter to roll again");
                    key.next();
                    thrdThrow = frstThrow = (int) Math.random() * (10 - 0);

                    if (thrdThrow == 10) {
                        System.out.println("You got a Strike!");
                        tenthFrame = true;


                    } else {

                        System.out.println("You hit " + thrdThrow + " pins!");
                        System.out.println("Press enter to end the game");
                        key.next();
                    }
                }

            } else {
                System.out.println("You got a strike");
                System.out.println("Press Enter to roll again.");
                key.next();
                scndThrow = (int) Math.random();
                if (scndThrow < 10) {
                    System.out.println("You hit " + scndThrow + " pins!");
                    System.out.println("Press Enter to roll again.");
                    key.next();
                    thrdThrow = (int) Math.random() * (scndThrow - 0);

                    if (thrdThrow < 10) {
                        System.out.println("You hit " + thrdThrow + " pins!");
                        System.out.println("Press enter to end the game");
                        key.next();
                    } else {
                        System.out.println("You got another Strike!!");
                        System.out.println("");
                    }

                }


            }


        }}}
}
