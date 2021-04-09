package com.itSchool;

public class Fibonacci {


    public static void main(String[] args) {



    }


    public static int getFibonachy(int num) {

        int fib = 0;
        if (num < 0)
            return 0;
        if (num == 0 || num == 1)
            return 1;
        else
            fib = getFibonachy(num - 1) +getFibonachy(num - 2);

        return fib;
    }
}
