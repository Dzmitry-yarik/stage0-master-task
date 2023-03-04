package com.epam.conditions;

import java.util.Scanner;

public class IntegerDivider {
    //    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int first, second, result, res;
//        System.out.println("Enter the dividend: ");
//        first = scn.nextInt();
//        System.out.println("Enter the divider: ");
//        second = scn.nextInt();
//    }
    public void printCompletelyDivided(int dividend, int divider) {
        Scanner scn = new Scanner(System.in);
        int result, res;
        while (divider == 0) {
            System.out.println("division by zero!!!");
            System.out.println("Enter another divider: ");
            divider = scn.nextInt();
            if (divider > 0) break;
        }
        result = dividend / divider;
        res = result * divider;
        if (res == dividend)
            System.out.println("can be divided completely");
        else
            System.out.println("cannot be divided completely");
    }
}
