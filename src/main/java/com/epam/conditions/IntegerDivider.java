package com.epam.conditions;

public class IntegerDivider {

    public static void printCompletelyDivided(int dividend, int divider) {
//        Scanner scn = new Scanner(System.in);
        int result, res;
        while (divider == 0) {
            System.out.println("division by zero");
                return;
        }
        result = dividend / divider;
        res = result * divider;
        if (res == dividend)
            System.out.println("can be divided completely");
        else
            System.out.println("cannot be divided completely");
    }
}

