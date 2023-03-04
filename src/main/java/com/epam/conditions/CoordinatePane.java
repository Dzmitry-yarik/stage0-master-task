package com.epam.conditions;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 && y == 0)
            System.out.print("0");
        else if (x == 0 || y == 0)
            System.out.print("Coordinates belong to two quarters at the same time");
        else if (x >= 0 && y >= 0)
            System.out.print("1");
        else if (x <= 0 && y >= 0)
            System.out.print("2");
        else if (x <= 0 && y <= 0)
            System.out.print("3");
        else if (x >= 0 && y <= 0)
            System.out.print("4");
    }
}
