package com.itSchool;

import java.util.Scanner;

// not work only prototype

public class Factorial {


    private static int factorial(int i) {


        if (i == 0) {
            return 0;
        }
        else if (i == 1) {
            return 1;
        }
        else
            return factorial(i - 1) + factorial( i - 2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        if (i == 0) {
            System.out.println(0);
        }
        else if (i == 1) {
            System.out.println(1);
        }
        else
            System.out.println(factorial(i));




    }
}
