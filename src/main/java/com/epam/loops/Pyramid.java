package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
      for (int i = cathetusLength - 1; i >= 0; i--) {
            System.out.print(" ".repeat(i));
            for (int k = cathetusLength - i; k > 0; k--) {
                System.out.print(k);
            }
            for (int j = 2; j <= cathetusLength - i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(8);
    }
}
