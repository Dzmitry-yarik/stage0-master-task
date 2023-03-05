package com.epam.conditions;

public class IntegerDivider {
 
    public void printCompletelyDivided(int dividend, int divider) {
        int result;
        int res;
        if (divider == 0) {
            System.err.println("division by zero");
        } else {
            result = dividend / divider;
            res = result * divider;
            if (res == dividend)
                System.err.println("can be divided completely");
            else
                System.err.println("cannot be divided completely");
        }
    }
}
