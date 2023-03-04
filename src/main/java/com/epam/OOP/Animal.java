package com.epam.OOP;

public class Animal {

   private String color;
   private int numberOfPaws;
   private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void getDescription(){
        System.out.println("This animal is basically " + color +
                ". It has " + numberOfPaws + paws(numberOfPaws) + "and " + hasFur + " fur.");
    }
    public String paws(int paw) {
        String paws;
        switch (paw) {
            case 1:
                paws = " paw ";
                break;
            default:
                paws = " paws ";
        }
        return paws;
    }
}

