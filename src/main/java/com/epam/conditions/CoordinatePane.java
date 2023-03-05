package com.epam.conditions;

public class CoordinatePane {

        public void printQuadrant(int x, int y) {
        if (x == 0 && y == 0)
            System.out.print("zero");
        else if (x == 0 || y == 0)
            System.out.print("Coordinates belong to two quarters at the same time");
        else if (x >= 0 && y >= 0)
            System.out.print("first");
        else if (x <= 0 && y >= 0)
            System.out.print("second");
        else if (x <= 0 && y <= 0)
            System.out.print("third");
        else if (x >= 0 && y <= 0)
            System.out.print("fourth");
    }
}
