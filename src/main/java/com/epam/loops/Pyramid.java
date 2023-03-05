package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int x;
        for (int i = 1; i <= cathetusLength; i++) {
            x = i - 1;
            for (int j = i; j <= cathetusLength - 1; j++) {
            }
            for (int j = 0; j <= x; j++)
                System.out.print((i + j) < cathetusLength * 2 ? (i - j)  : (i + j));
            int a = 2;
            for (int j = 1; j <= x; j++) {
                System.out.print((i + x - j) < cathetusLength * 2 ? (a) : (i + x - j));
                a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(8);
    }
}
