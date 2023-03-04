package com.epam.loops;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        for(int i = 1; i <= 10; i++){
            System.out.println(numberTableToPrint + " * " + i + " = " + numberTableToPrint * i);
        }
        System.out.println("***********************************************");
        for(int i = 1; i <= numberTableToPrint; i++){
            for(int k = 1; k <= 10; k++){
                System.out.print(k * i + "\t");
            }
            System.out.println("");
        }
    }
}
