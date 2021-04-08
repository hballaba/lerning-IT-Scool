package com.itSchool;


import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Random random = new Random();


        int i = random.nextInt(100);

        System.out.println("Enter number from 0 to 100");

        int num = -1;
        Scanner scan = new Scanner(System.in);

        while (i != num) {
            while(!scan.hasNextInt()) {
                String tmp = scan.next();
                System.out.println("Wrong number");
            }
            num = scan.nextInt();

            if (num < i)
                System.out.println("More");
            else if (num > i)
                System.out.println("Less");
            else
                System.out.println("Absolutly");

        };

        System.out.println("random number = " + i);

    }
}
