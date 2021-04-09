package com.itSchool;
import java.util.ArrayList;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class MinMaxMiddle {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            list.add(i);
        int max = list.get(0);
        int min = list.get(0);
        int  middle = 0;
        for(int i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                max = i;
            }
            middle += i;
        }
        System.out.println("Max number = " +  max);
        System.out.println("Min number = " +  min);
        System.out.println("Middle value = " + middle / (double)list.size());

    }
}
