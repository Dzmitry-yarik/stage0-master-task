package com.epam.conditions;

public class IntegerDivider {
 
    public void printCompletelyDivided(int dividend, int divider) {
        int result;
        int res;
        if (divider == 0) {
            System.out.println("division by zero");
        } else {
            result = dividend / divider;
            res = result * divider;
            if (res == dividend)
                System.out.println("can be divided completely");
            else
                System.out.println("cannot be divided completely");
        }
    }
}
