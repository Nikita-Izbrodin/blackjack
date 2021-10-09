package com.company;

import java.util.Random; // allows generating random numbers
import java.util.Scanner; // allows to take input from user

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random randNum = new Random(); // instance of random class
        Scanner input = new Scanner(System.in);

        System.out.println("GENERATING RANDOM NUMBER FOR COMPUTER");
        int PCnum1 = randNum.nextInt(12);
        int PCnum2 = randNum.nextInt(12);
        int PCnumTotal = PCnum1 + PCnum2;
        //System.out.println(PCnumTotal); // test

        System.out.println("GENERATING RANDOM NUBMER FOR USER");
        int USERnum1 = randNum.nextInt(12);
        int USERnum2 = randNum.nextInt(12);
        int USERnumTotal = USERnum1 + USERnum2;
        System.out.println("Your number is: " + USERnumTotal);

        if (USERnumTotal < 21) {
            System.out.println("Would you like to get another random number between 1 and 11 and add it to your score? y/n ");
            String answer = input.next();
            if (answer == "y") {
                USERnum1 = randNum.nextInt(12);
                USERnum2 = randNum.nextInt(12);
                USERnumTotal = USERnum1 + USERnum2 + USERnumTotal;
                System.out.println("Your number is: " + USERnumTotal);
            }
        }

        if (PCnumTotal < 21) {
            PCnum1 = randNum.nextInt(12);
            PCnum2 = randNum.nextInt(12);
            PCnumTotal = PCnum1 + PCnum2 + PCnumTotal;
        }
    }
}
